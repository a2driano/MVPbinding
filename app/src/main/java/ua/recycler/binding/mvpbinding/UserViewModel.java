package ua.recycler.binding.mvpbinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ua.recycler.binding.mvpbinding.model.User;
import ua.recycler.binding.mvpbinding.presenter.LoginContract;


/**
 * Created by kunde on 06.11.2017.
 */

public class UserViewModel extends BaseObservable {
    private User user;
    public LoginContract.EventListener listener;
    public String login;
    public String password;
    public String passwordSecond;

    public UserViewModel(User user, LoginContract.EventListener listener) {
        this.listener = listener;
        login = user.login;
        password = user.password;
        passwordSecond = user.password;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public LoginContract.EventListener getListener() {
        return listener;
    }

    public void setListener(LoginContract.EventListener listener) {
        this.listener = listener;
    }

    @Bindable
    public String getLogin() {
        return login;
    }

//    public void setLogin(String login) {
//        this.login = login;
//        notifyPropertyChanged(BR.login);
//    }
//
//    @Bindable
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//        notifyPropertyChanged(BR.password);
//    }
//
//    @Bindable
//    public String getPasswordSecond() {
//        return passwordSecond;
//    }
//
//    public void setPasswordSecond(String passwordSecond) {
//        this.passwordSecond = passwordSecond;
//        notifyPropertyChanged(BR.password);
//    }
//
//    private boolean validatePassword() {
//        boolean matches = !isNullOrEmpty(mPassword) && mPassword.length() >= Const.MIN_LENGTH_PASSWORD;
//        return matches;
//    }
}
