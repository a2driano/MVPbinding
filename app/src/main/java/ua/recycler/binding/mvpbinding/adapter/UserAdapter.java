package ua.recycler.binding.mvpbinding.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ua.recycler.binding.mvpbinding.R;
import ua.recycler.binding.mvpbinding.databinding.ItemViewBinding;
import ua.recycler.binding.mvpbinding.model.Child;
import ua.recycler.binding.mvpbinding.model.User;


/**
 * Created by Andrii Papai on 12.11.2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> mUserList;

    public UserAdapter(List<User> mUserList) {
        this.mUserList = mUserList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemViewBinding binding = ItemViewBinding.inflate(inflater, parent, false);
        return new UserViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = mUserList.get(position);
        holder.binding.setUser(user);
        holder.user = user;
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }


    public class UserViewHolder extends RecyclerView.ViewHolder {
        ItemViewBinding binding;
        User user;

        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
            ViewGroup view = itemView.findViewById(R.id.layout_user);
            if (user != null) {
                if (user.getChildrenList().size() > 0) {
                    for (Child child : user.getChildrenList()) {
                        TextView name = new TextView(itemView.getContext());
                        name.setText("Child name: " + child.getName());
                        TextView age = new TextView(itemView.getContext());
                        age.setText("" + child.getAge());


                        view.addView(name);
                        view.addView(age);
                    }
                }
            }

        }
    }
}
