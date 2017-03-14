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
        arr.add("123");
        arr.add("abc");
        arr.add("A1b2C3");
        for (String element : arr) {
            System.out.println("This is element: " + element);
        }
    }

}