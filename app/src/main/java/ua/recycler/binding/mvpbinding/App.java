package ua.recycler.binding.mvpbinding;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import ua.recycler.binding.mvpbinding.data.DBManager;

/**
 * Created by kunde on 06.11.2017.
 */

public class App extends Application {
    private static DBManager manager;

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);

        manager = DBManager.getInstance(this);
    }

    public static DBManager getManager() {
        return manager;
    }
}
