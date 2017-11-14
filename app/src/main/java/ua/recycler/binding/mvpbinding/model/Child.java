package ua.recycler.binding.mvpbinding.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by kunde on 08.11.2017.
 */

public class Child {
    @PrimaryKey
    private long id;

    private String name;
    private int age;

    public Child() {
        this.id = System.currentTimeMillis();
    }

    public Child(String name, int age) {
        this.id = System.currentTimeMillis();
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
