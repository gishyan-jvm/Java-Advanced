package com.arthur.edu.myCollections;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ArrList<Integer> list = new ArrList<>();

        LinkList<String> strings = new LinkList<>();

        strings.add("Arthur");
        strings.add("Knar");
        strings.add("Anna");
        strings.add("Vahe");

        System.out.println(strings);
        System.out.println(strings.size());

        System.out.println(strings.getFirst());

        list.add(6);
        list.add(7);

        System.out.println(list);
    }
}
