package com.arthur.edu.Lesson28;

import java.sql.SQLOutput;
import java.util.List;

public class StreamTestClass {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 6, 5, 84, 41, 1542);

        integers
                .parallelStream()
                .peek(System.out::println).toList()
                .forEach(System.out::println);
    }
}
