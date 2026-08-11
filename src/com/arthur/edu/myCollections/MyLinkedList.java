package com.arthur.edu.myCollections;

public interface MyLinkedList<T> {
    void add(T element);

    void add(int index, T element);

    int size();

    void clear();

    void set(int index, T element);

    void remove(int index);

    T getFirst();

    T getLast();
}
