package ua.recycler.binding.mvpbinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import ua.recycler.binding.mvpbinding.databinding.ActivityMainBinding;
import ua.recycler.binding.mvpbinding.model.User;
import ua.recycler.binding.mvpbinding.presenter.LoginContract;
import ua.recycler.binding.mvpbinding.presenter.PresenterView;

public class MainActivity extends AppCompatActivity implements LoginContract.View {
    private Button mChildButton;
    private LoginContract.EventListener mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = new PresenterView(this);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setModel(new UserViewModel(new User(), mPresenter));
        binding.setListener(mPresenter);


        binding.buttonChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.childAge.getText().toString();
                binding.childAge.getText().toString();
            }
        });
    }

    @Override
    public void startFragment() {
        Log.d("TAG","************click");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
