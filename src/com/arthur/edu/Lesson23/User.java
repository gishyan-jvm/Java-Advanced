package com.arthur.edu.Lesson23;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5412681296321444213L;

    private final String email;
    private final transient String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
