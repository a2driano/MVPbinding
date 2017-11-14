package ua.recycler.binding.mvpbinding;

import android.app.Application;
import android.arch.persistence.room.Room;

import ua.recycler.binding.mvpbinding.data.DataBaseManager;
import ua.recycler.binding.mvpbinding.data.room.DataBaseManagerRoom;
import ua.recycler.binding.mvpbinding.data.room.Injection;

/**
 * Created by kunde on 06.11.2017.
 */

public class App extends Application {
    private static DataBaseManager manager;

    @Override
    public void onCreate() {
        super.onCreate();
//        manager = DBManagerRealm.getInstance(this);
        manager = Injection.provideUserDataSource(getApplicationContext());
    }

    public static DataBaseManager getManager() {
        return manager;
    }
}
