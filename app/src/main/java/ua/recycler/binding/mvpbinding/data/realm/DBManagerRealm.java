//package ua.recycler.binding.mvpbinding.data.realm;
//
//import android.content.Context;
//import android.widget.Toast;
//
//import java.util.List;
//
//import io.realm.Realm;
//import io.realm.RealmConfiguration;
//import io.realm.RealmResults;
//import io.realm.exceptions.RealmException;
//import ua.recycler.binding.mvpbinding.data.DataBaseManager;
//import ua.recycler.binding.mvpbinding.model.User;
//
///**
// * Created by kunde on 08.11.2017.
// */
//
//public class DBManagerRealm implements DataBaseManager {
//    private Realm mRealm;
//    private Context context;
//    private static DBManagerRealm manager;
//
//    private DBManagerRealm(Context context) {
//        this.context = context;
//        init();
//    }
//
//    private void init() {
//        mRealm = Realm.getDefaultInstance();
//
//        Realm.init(context);
//        RealmConfiguration config = new RealmConfiguration.Builder().build();
//        Realm.setDefaultConfiguration(config);
//    }
//
//    public static DBManagerRealm getInstance(Context context) {
//        if (manager == null) {
//            manager = new DBManagerRealm(context);
//        }
//        return manager;
//    }
//
//    @Override
//    public void addUser(User user) {
//        try {
//            mRealm.beginTransaction();
//            mRealm.copyToRealmOrUpdate(user);
//            mRealm.commitTransaction();
//            Toast.makeText(context, "User save", Toast.LENGTH_SHORT).show();
//        } catch (RealmException e) {
//            mRealm.cancelTransaction();
//        }
//    }
//
//    @Override
//    public void delete(User user) {
//
//    }
//
//    @Override
//    public List<User> getUsers() {
//        RealmResults<User> realmList = mRealm.where(User.class).findAll();
//        List<User> list = realmList.subList(0, realmList.size() - 1);
//        return list;
//    }
//
//    @Override
//    public User getUser(String login) {
//        return null;
//    }
//}
