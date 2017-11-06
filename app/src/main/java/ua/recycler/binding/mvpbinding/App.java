package ua.recycler.binding.mvpbinding;

import android.app.Application;

/**
 * Created by kunde on 06.11.2017.
 */

public class App extends Application {
    public static String login;
    public static String password;

    @Override
    public void onCreate() {
        super.onCreate();

        login = "";
        password = "";
    }
}
