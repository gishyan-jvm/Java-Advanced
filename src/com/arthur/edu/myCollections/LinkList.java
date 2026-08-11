package com.arthur.edu.myCollections;

import java.util.Arrays;

public class LinkList<T> implements MyLinkedList<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkList() {

    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

        size++;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;

            if (size == 0) {
                tail = newNode;
            }

            size++;
            return;
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (index == size) {
            tail = newNode;
        }

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {

            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }

            return;
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        if (current.next == tail) {
            tail = current;
        }

        current.next = current.next.next;

        size--;
    }

    @Override
    public void set(int index, Object element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.element = (T) element;
    }

    @Override
    public T getFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        return head.element;
    }

    @Override
    public T getLast() {
        if (tail == null) {
            throw new IllegalStateException("List is empty");
        }

        return tail.element;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<T> current = head;

        while (current != null) {
            result.append(current.element);

            if (current.next != null) {
                result.append(", ");
            }

            current = current.next;
        }

        result.append("]");

        return result.toString();
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }
}
