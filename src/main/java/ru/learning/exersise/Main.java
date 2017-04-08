package ru.learning.exersise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Main method for testing MyArray class.
 */
public class Main {

    public static void main(String[] args) {
        GenericDynamicArray<Integer> arr = new GenericDynamicArray();
        arr.add(1); // 0
        arr.add(3); // 1
        arr.add(5); // 2
        arr.add(10); // 3
        arr.add(7); // 4

        GenericCollection<Integer> list = new GenericLinkedList<>(arr);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.get(3));

        list.indexOf(10);
    }

}