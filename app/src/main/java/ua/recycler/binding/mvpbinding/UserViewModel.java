package ua.recycler.binding.mvpbinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.List;

import io.realm.RealmList;
import ua.recycler.binding.mvpbinding.model.Child;
import ua.recycler.binding.mvpbinding.model.User;
import ua.recycler.binding.mvpbinding.presenter.LoginContract;


/**
 * Created by kunde on 06.11.2017.
 */

public class UserViewModel extends BaseObservable {
    private User user;
    private LoginContract.EventListener listener;
    private long id;
    private String login;
    private String password;
    private String passwordSecond;
//    private RealmList<Child> childList;
    private boolean valid;

//    public UserViewModel(User user, LoginContract.EventListener listener) {
//        this.listener = listener;
//        id = user.getId();
//        login = user.getLogin();
//        password = user.getPassword();
//        passwordSecond = user.getPassword();
//        this.user = user;
//    }

    public UserViewModel(User user, LoginContract.EventListener listener) {
        this.listener = listener;
        id = user.getId();
        login = user.getLogin();
        password = user.getPassword();
        passwordSecond = user.getPassword();
        this.user = user;
//        childList = user.getChildrenList();
    }

//    public RealmList<Child> getChildList() {
//        return childList;
//    }
//
//    public void setChildList(RealmList<Child> childList) {
//        user.setChildrenList(childList);
//        this.childList = childList;
//    }

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

    public boolean validatePassword() {
        boolean matches = password.equals(passwordSecond) & !password.isEmpty();
        return matches;
    }


}
