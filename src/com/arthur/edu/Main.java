package com.arthur.edu;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public static <T extends Comparable<T>> int isEqual(T el1, T el2) {
        return el1.compareTo(el2);
    }
}