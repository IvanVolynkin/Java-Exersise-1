package ru.learning.exersise;

/**
 * Main method for testing MyArray class.
 */
public class Main {

    public static void main(String[] args) {
        GenericDynamicArray<Integer> genericDynamicArray1 = new GenericDynamicArray<Integer>();
        GenericDynamicArray<String> genericDynamicArray2 = new GenericDynamicArray<String>();

        genericDynamicArray1.showArray();
        genericDynamicArray2.showArray();
    }
}