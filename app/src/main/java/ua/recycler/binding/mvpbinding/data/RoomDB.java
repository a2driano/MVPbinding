package ua.recycler.binding.mvpbinding.data;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;

import ua.recycler.binding.mvpbinding.model.User;

/**
 * Created by kunde on 13.11.2017.
 */
@Database(entities = {User.class}, version = 1)
public class RoomDB extends RoomDatabase {
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
