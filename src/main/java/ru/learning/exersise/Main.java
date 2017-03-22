package ru.learning.exersise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Main method for testing MyArray class.
 */
public class Main {

    public static void main(String[] args) {
        GenericDynamicArray<String> arr = new GenericDynamicArray();
        arr.add("123"); // 0
        arr.add("456"); // 1
        arr.add("abc"); // 2
        arr.add("ABC"); // 3
        arr.add("A1b2C3"); // 4

        GenericCollection<String> list = new GenericLinkedList<>(arr);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.get(3));
    }

}