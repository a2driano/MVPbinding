package ua.recycler.binding.mvpbinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.recycler.binding.mvpbinding.databinding.ActivitySecondBinding;
import ua.recycler.binding.mvpbinding.model.User;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        User model = new User(App.login, App.password);
        binding.setModel(model);
    }
}
