package ua.recycler.binding.mvpbinding.data.room;

import android.content.Context;

import ua.recycler.binding.mvpbinding.data.DataBaseManager;

/**
 * Created by Andrii Papai on 14.11.2017.
 */

public class Injection {
    public static DataBaseManager provideUserDataSource(Context context) {
        RoomDB database = RoomDB.getInstance(context);
        return new DataBaseManagerRoom(database.userDao());
    }
}
