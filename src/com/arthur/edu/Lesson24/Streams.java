package com.arthur.edu.Lesson24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 44, -7, -9, 55, -61, 81, 74));

        Optional<Integer> reduce = list.stream()
                .filter((el) -> el > 0)
                .reduce((Integer::sum));

        reduce.ifPresent(System.out::println);
    }
}
