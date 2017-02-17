package ru.learning.exersise;

/**
 * Main method for testing MyArray class.
 */
public class Main {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.remove(1);


        dynamicArray.showArray();
    }
}
