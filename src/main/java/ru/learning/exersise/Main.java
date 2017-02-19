package ru.learning.exersise;

/**
 * Main method for testing MyArray class.
 */
public class Main {

    public static void main(String[] args) {
        GenericDynamicArray genericDynamicArray = new GenericDynamicArray<Integer>(Integer.class);

        genericDynamicArray.showArray();
    }
}
