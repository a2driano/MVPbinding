package ua.recycler.binding.mvpbinding.model;

import android.databinding.Bindable;

import java.util.List;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by kunde on 06.11.2017.
 */

public class User extends RealmObject {

    @PrimaryKey
    private long id;

    public String login;
    public String password;
    public List<Child> childrenList;


    public User() {
        login = "";
        password = "";
    }

    public User(String login, String password, List<Child> childrenList) {
        this.id = System.currentTimeMillis();
        this.login = login;
        this.password = password;
        this.childrenList = childrenList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }

    @Bindable
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
