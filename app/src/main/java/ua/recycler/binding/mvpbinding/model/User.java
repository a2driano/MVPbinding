package ua.recycler.binding.mvpbinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by kunde on 06.11.2017.
 */

public class User extends BaseObservable{
    public String login;
    public String password;

    public User() {
        login = "";
        password = "";
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
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
