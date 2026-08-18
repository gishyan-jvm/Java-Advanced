package com.arthur.edu.Lesson31;

public class Main {
    public static void main(String[] args) {
        Class<Human> humanClass = Human.class;

        System.out.println(humanClass.getName());
        System.out.println(humanClass.isArray());
        System.out.println(humanClass.getClassLoader().getName());


    }
}
