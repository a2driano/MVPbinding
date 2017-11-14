package ua.recycler.binding.mvpbinding.data.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import ua.recycler.binding.mvpbinding.model.User;

/**
 * Created by kunde on 13.11.2017.
 */
@Database(entities = {User.class}, version = 1)
public abstract class RoomDB extends RoomDatabase {

    private static volatile RoomDB INSTANCE;

    public abstract UserDao userDao();

    public static RoomDB getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (RoomDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            RoomDB.class, "Sample.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
