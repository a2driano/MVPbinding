package ua.recycler.binding.mvpbinding.data;

import java.util.List;

import ua.recycler.binding.mvpbinding.model.User;

/**
 * Created by kunde on 13.11.2017.
 */

public interface DataBaseManager {
    void addUser(User user);

    void delete(User user);

    List<User> getUsers();

    User getUser(String login);
}
