package ua.recycler.binding.mvpbinding.data.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import ua.recycler.binding.mvpbinding.model.User;

/**
 * Created by kunde on 13.11.2017.
 */
@Dao
public interface UserDao {
    /**
     * Get the user from the table. Since for simplicity we only have one user in the database,
     * this query gets all users from the table, but limits the result to just the 1st user.
     *
     * @return the user from the table
     */
    @Query("SELECT * FROM Users WHERE login LIKE :login")
    User getUser(String login);

    /**
     * Get all users from table.
     */
    @Query("SELECT * FROM Users")
    List<User> getUsers();

    /**
     * Insert a user in the database. If the user already exists, replace it.
     *
     * @param user the user to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(User user);

    @Delete
    void deleteUser(User user);

    /**
     * Delete all users.
     */
    @Query("DELETE FROM Users")
    void deleteAllUsers();
}
