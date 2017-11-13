package ua.recycler.binding.mvpbinding.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by kunde on 06.11.2017.
 */

public class User extends RealmObject {

    @PrimaryKey
    private long id;

    private String login;
    private String password;
    private RealmList<Child> childrenList;


    public User() {
        this.id = System.currentTimeMillis();
        login = "";
        password = "";
        childrenList = new RealmList<>();
    }

    public User(String login, String password, RealmList<Child> childrenList) {
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

    public RealmList<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(RealmList<Child> childrenList) {
        this.childrenList = childrenList;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", childrenList=" + childrenList +
                '}';
    }
}
