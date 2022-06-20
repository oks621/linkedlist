package main.java;

import java.util.Objects;

public class MyLinkedList<T> {


    private Node<T> first;
    private int size;

    //добавляет элемент в конец
    public void add(Object value) {
        Node newNode = new Node(value);
        Node perviousnode = first;
        if (first == null) {
            first = newNode;
        } else {
            while (perviousnode.next != null) {
                perviousnode = perviousnode.next;
            }
            perviousnode.next = newNode;
        }

        size++;
    }

    public int size() {
        return size;
    }


    private Node<T> getNodeByIndex(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void clear() {
        first = first.next = null;
        size = 0;
    }


    public T get(int index) {
        validateIndex(index);
        return getNodeByIndex(index).element;
    }

    private void validateIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index can't be found! "
                    + ". Total size of list = " + size);
        }


    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first + ", size=" + size +
                '}';
    }

    public T remove(int index) {
        validateIndex(index);
        T removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                first.next = null;
            }
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            removedElement = prev.element;
            prev.next = prev.next.next;
        }
        size--;
        return removedElement;
    }

    private static class Node<T> {
        T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }

    }
}