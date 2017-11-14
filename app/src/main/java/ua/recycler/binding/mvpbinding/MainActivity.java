package ua.recycler.binding.mvpbinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import ua.recycler.binding.mvpbinding.databinding.ActivityMainBinding;
import ua.recycler.binding.mvpbinding.model.Child;
import ua.recycler.binding.mvpbinding.model.User;
import ua.recycler.binding.mvpbinding.presenter.LoginContract;
import ua.recycler.binding.mvpbinding.presenter.PresenterView;
import ua.recycler.binding.mvpbinding.view.UserViewModel;

public class MainActivity extends AppCompatActivity implements LoginContract.View {
    private LoginContract.EventListener mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = new PresenterView(this);
        User user = new User();
        final UserViewModel userModel = new UserViewModel(user, mPresenter);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setModel(userModel);
        binding.setListener(mPresenter);

        binding.buttonChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.childName.getText().toString();
                int age = Integer.parseInt(binding.childAge.getText().toString());

                userModel.getUser().getChildrenList().add(new Child(name, age));
            }
        });
    }

    @Override
    public void startFragment() {
        Log.d("TAG", "************click");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
