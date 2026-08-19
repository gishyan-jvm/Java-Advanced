package com.arthur.edu.DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        User build = User.builder("Arthur", "Gishyan", "arthur@gmail.com", "pass123")
                .isAdmin(true)
                .build();

        System.out.println(build);
    }
}
