package ua.recycler.binding.mvpbinding;

import android.content.Context;

import io.realm.Realm;
import io.realm.exceptions.RealmException;
import ua.recycler.binding.mvpbinding.model.User;

/**
 * Created by kunde on 08.11.2017.
 */

public class DBManager {
    private Realm mRealm;
    private Context context;
    private static DBManager manager;

    private DBManager(Context context) {
        this.context = context;
        init();
    }

    private void init() {
        mRealm = Realm.getDefaultInstance();
    }

    public static DBManager getInstance(Context context) {
        if (manager == null) {
            manager = new DBManager(context);
        }
        return manager;
    }

    public void addUser(User user){
        try {
            mRealm.beginTransaction();
            mRealm.copyToRealmOrUpdate(user);
            mRealm.commitTransaction();
        } catch (RealmException e) {
            mRealm.cancelTransaction();
        }
    }
}
