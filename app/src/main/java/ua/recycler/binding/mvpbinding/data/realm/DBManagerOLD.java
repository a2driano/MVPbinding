//package ua.recycler.binding.mvpbinding.data.realm;
//
//import android.content.Context;
//import android.widget.Toast;
//
//import java.util.List;
//
//import io.realm.Realm;
//import io.realm.RealmResults;
//import io.realm.exceptions.RealmException;
//import ua.recycler.binding.mvpbinding.model.User;
//
///**
// * Created by kunde on 08.11.2017.
// */
//
//public class DBManagerOLD {
//    private Realm mRealm;
//    private Context context;
//    private static DBManagerOLD manager;
//
//    private DBManagerOLD(Context context) {
//        this.context = context;
//        init();
//    }
//
//    private void init() {
//        mRealm = Realm.getDefaultInstance();
//    }
//
//    public static DBManagerOLD getInstance(Context context) {
//        if (manager == null) {
//            manager = new DBManagerOLD(context);
//        }
//        return manager;
//    }
//
//    public void addUser(User user) {
//        try {
//            mRealm.beginTransaction();
//            mRealm.copyToRealmOrUpdate(user);
//            mRealm.commitTransaction();
//            Toast.makeText(context, "User save", Toast.LENGTH_SHORT).show();
//        } catch (RealmException e) {
//            mRealm.cancelTransaction();
//        }
//    }
//
////    public RealmResults<User> getUsers() {
////        return mRealm.where(User.class).findAll();
////    }
//
//    public List<User> getUsers() {
//        RealmResults<User> realmList = mRealm.where(User.class).findAll();
//        List<User> list = realmList.subList(0, realmList.size() - 1);
//        return list;
//    }
//}
