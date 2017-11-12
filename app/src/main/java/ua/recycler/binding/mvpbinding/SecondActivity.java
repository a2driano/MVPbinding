package ua.recycler.binding.mvpbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ua.recycler.binding.mvpbinding.adapter.UserAdapter;
import ua.recycler.binding.mvpbinding.model.User;


public class SecondActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        List<User> list = App.getManager().getUsers();

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new UserAdapter(list));

    }
}
