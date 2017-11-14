package ua.recycler.binding.mvpbinding.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by kunde on 06.11.2017.
 */
@Entity(tableName = "Users")
public class User {
    @PrimaryKey
    @ColumnInfo(name = "userid")
    private long id;
    @ColumnInfo(name = "login")
    private String login;
    private String password;
//    private RealmList<Child> childrenList;

    @Ignore
    private List<Child> childrenList;


    public User() {
        login = "";
        password = "";
        childrenList = new ArrayList<>();
    }

    public User(String login, String password, List<Child> childrenList) {
        this.login = login;
        this.password = password;
        this.childrenList = childrenList;
    }

    public User(long id, String login, String password, List<Child> childrenList) {
        this.id = id;
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
