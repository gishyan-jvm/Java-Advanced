package com.arthur.edu.myCollections;

import java.awt.*;

public interface MyList<T> extends Iterable<T> {
    void add(T element);

    T get(int index);

    void remove(int index);

    int size();
}
