package com.espresso.databinding;

public class User {

    public String name;
    public String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static User getTestUser() {
        return new User("Tom", "20");
    }
}
