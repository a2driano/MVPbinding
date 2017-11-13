package ua.recycler.binding.mvpbinding;

import android.app.Application;

import ua.recycler.binding.mvpbinding.data.DBManager;
import ua.recycler.binding.mvpbinding.data.DataBaseManager;

/**
 * Created by kunde on 06.11.2017.
 */

public class App extends Application {
    private static DataBaseManager manager;

    @Override
    public void onCreate() {
        super.onCreate();
        manager = DBManager.getInstance(this);
    }

    public static DataBaseManager getManager() {
        return manager;
    }
}
