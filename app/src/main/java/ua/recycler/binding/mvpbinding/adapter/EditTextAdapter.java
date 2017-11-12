package ua.recycler.binding.mvpbinding.adapter;

import android.databinding.BindingAdapter;
import android.support.design.widget.TextInputLayout;

/**
 * Created by Andrii Papai on 12.11.2017.
 */

public class EditTextAdapter {

    @BindingAdapter("app:errorText")
    public static void setError(TextInputLayout view, String error) {
        view.setError(error);
    }
}
