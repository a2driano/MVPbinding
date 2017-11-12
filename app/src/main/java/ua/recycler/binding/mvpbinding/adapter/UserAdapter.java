package ua.recycler.binding.mvpbinding.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ua.recycler.binding.mvpbinding.databinding.ItemViewBinding;
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
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }


    public class UserViewHolder extends RecyclerView.ViewHolder {
        ItemViewBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
