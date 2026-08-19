package com.arthur.edu.Lesson31;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        Class<Human> humanClass = Human.class;

        System.out.println(humanClass.getName());
        System.out.println(humanClass.isArray());
        System.out.println(humanClass.getClassLoader().getName());

        Field[] declaredField = humanClass.getDeclaredFields();

        for (Field field : declaredField) {
            String name = field.getName();
            System.out.println("Field: " + name);
        }

        Method[] declaredMethods = humanClass.getDeclaredMethods();

        for (Method method : declaredMethods) {
            String name = method.getName();
            System.out.println("Method: " + name);
        }
    }
}
