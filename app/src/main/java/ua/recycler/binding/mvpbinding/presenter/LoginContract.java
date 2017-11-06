package ua.recycler.binding.mvpbinding.presenter;

import ua.recycler.binding.mvpbinding.model.User;

/**
 * Created by kunde on 06.11.2017.
 */

public interface LoginContract {
    interface View {
        void startFragment();

    }

    interface EventListener {
        void registration(User access);
    }
}
