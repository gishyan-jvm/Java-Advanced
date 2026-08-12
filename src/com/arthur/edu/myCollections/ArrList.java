package com.arthur.edu.myCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrList<T> implements MyList<T> {

    private int size;
    private Object[] arr;

    public ArrList() {
        arr = new Object[10];
    }

    public ArrList(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        arr = new Integer[capacity];
    }

    @Override
    public void add(T element) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }

        arr[size] = element;
        size++;
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(arr[i]);

            if (i < size - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        MyList.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return MyList.super.spliterator();
    }
}
