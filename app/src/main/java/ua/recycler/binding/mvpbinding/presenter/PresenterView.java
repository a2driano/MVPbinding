package ua.recycler.binding.mvpbinding.presenter;

import android.util.Log;

import ua.recycler.binding.mvpbinding.App;
import ua.recycler.binding.mvpbinding.model.User;


/**
 * Created by kunde on 06.11.2017.
 */

public class PresenterView implements LoginContract.EventListener {
    private LoginContract.View view;

    public PresenterView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void registration(User user) {
        App.getManager().addUser(user);

        Log.d("SAVE","*****************" + user.toString());

        view.startFragment();
    }
}
