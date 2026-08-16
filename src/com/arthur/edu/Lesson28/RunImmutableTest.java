package com.arthur.edu.Lesson28;

import java.util.HashMap;
import java.util.Map;

public class RunImmutableTest {
    public static void main(String[] args) {
        Map<ImmutableTest, String> map = new HashMap<>();

        ImmutableTest k = new ImmutableTest(2, "Name");

        map.put(k, "String");

        String string = map.get(k);

        System.out.println(string);

    }
}
