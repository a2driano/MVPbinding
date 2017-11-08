package ua.recycler.binding.mvpbinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.List;

import ua.recycler.binding.mvpbinding.model.User;
import ua.recycler.binding.mvpbinding.presenter.LoginContract;


/**
 * Created by kunde on 06.11.2017.
 */

public class UserViewModel extends BaseObservable {
    public User user;
    public LoginContract.EventListener listener;
    public long id;
    public String login;
    public String password;
    public String passwordSecond;
    public boolean valid;

    public UserViewModel(User user, LoginContract.EventListener listener) {
        this.listener = listener;
        id = user.getId();
        login = user.login;
        password = user.password;
        passwordSecond = user.password;
        this.user = user;
    }

    @Bindable
    public User getUser() {
        user.setLogin(login);
        user.setPassword(password);
        return user;
    }

    public LoginContract.EventListener getListener() {
        return listener;
    }

    public void setListener(LoginContract.EventListener listener) {
        this.listener = listener;
    }

    @Bindable
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = validatePassword();
        notifyPropertyChanged(ua.recycler.binding.mvpbinding.BR.valid);
    }

    @Bindable
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        notifyPropertyChanged(ua.recycler.binding.mvpbinding.BR.login);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(ua.recycler.binding.mvpbinding.BR.password);
        setValid(validatePassword());
    }

    @Bindable
    public String getPasswordSecond() {
        return passwordSecond;
    }

    public void setPasswordSecond(String passwordSecond) {
        this.passwordSecond = passwordSecond;
        notifyPropertyChanged(ua.recycler.binding.mvpbinding.BR.passwordSecond);
        setValid(validatePassword());
    }

    private boolean validatePassword() {
        boolean matches = password.equals(passwordSecond);
        return matches;
    }
}
