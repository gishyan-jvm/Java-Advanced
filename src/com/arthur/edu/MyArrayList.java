package com.arthur.edu;

import java.util.Arrays;

public class MyArrayList implements MyList {

    private Integer[] values;
    private int size;

    public MyArrayList() {
        values = new Integer[10];
    }

    public MyArrayList(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        values = new Integer[capacity];
    }

    @Override
    public void add(Integer number) {
        if (size == values.length) {
            values = Arrays.copyOf(values, (values.length * 3) / 2 + 1);
        }

        values[size] = number;
        size++;

    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return values[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size - 1] = null;
        size--;

    }

    @Override
    public Integer size() {
        return size;
    }
}
