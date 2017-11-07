package ua.recycler.binding.mvpbinding.presenter;

import android.util.Log;

import ua.recycler.binding.mvpbinding.App;
import ua.recycler.binding.mvpbinding.model.User;

import static ua.recycler.binding.mvpbinding.App.login;
import static ua.recycler.binding.mvpbinding.App.password;

/**
 * Created by kunde on 06.11.2017.
 */

public class PresenterView implements LoginContract.EventListener {
    private LoginContract.View view;

    public PresenterView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void registration(User model) {
        login = model.login;
        password = model.password;
        Log.d("TAG","************login:" + login);
        Log.d("TAG","************password:" + password);

        view.startFragment();
    }
}
