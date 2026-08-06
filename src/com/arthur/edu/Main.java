package com.arthur.edu;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        try {
//            Human human = new Human(null,null,null);
//            String name = human.getName();
//            System.out.println(name);
//
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//        System.out.println(123);
//        if (isPalindrome(122)) {
//            System.out.println("Palindrome");
//        }
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(12);
        list.add(133);
        list.add(16);
        list.add(201);

        System.out.println(list);

        List<Human> humans = new ArrayList<>();

        humans.add(new Human("Arthur", "Gishyan", 2006));
        humans.add(new Human("Knar", "Gishyan", 2003));

        System.out.println(humans);
    }
}