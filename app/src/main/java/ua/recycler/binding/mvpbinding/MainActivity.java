package ua.recycler.binding.mvpbinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.recycler.binding.mvpbinding.databinding.ActivityMainBinding;
import ua.recycler.binding.mvpbinding.model.User;
import ua.recycler.binding.mvpbinding.presenter.LoginContract;
import ua.recycler.binding.mvpbinding.presenter.PresenterView;

public class MainActivity extends AppCompatActivity implements LoginContract.View {
    private LoginContract.EventListener mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = new PresenterView(this);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User model = new User();
        binding.setModel(new UserViewModel(new User(), mPresenter));

    }

    @Override
    public void startFragment() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
