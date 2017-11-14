package ua.recycler.binding.mvpbinding.data.room;

import android.arch.persistence.room.Dao;

import java.util.List;

import ua.recycler.binding.mvpbinding.data.DataBaseManager;
import ua.recycler.binding.mvpbinding.model.User;

/**
 * Created by Andrii Papai on 14.11.2017.
 */

public class DataBaseManagerRoom implements DataBaseManager {
    private static DataBaseManagerRoom sDataBaseManagerRoom;
    private final UserDao mUserDao;

    public DataBaseManagerRoom(UserDao userDao) {
        mUserDao = userDao;
    }

    @Override
    public void addUser(User user) {
        mUserDao.insertUser(user);
    }

    @Override
    public void delete(User user) {
        mUserDao.deleteUser(user);
    }

    @Override
    public List<User> getUsers() {
        return mUserDao.getUsers();
    }

    @Override
    public User getUser(String login) {
        return mUserDao.getUser(login);
    }
}
