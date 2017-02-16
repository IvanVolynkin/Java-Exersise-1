package ru.learning.exersise;

/**
 * Main method for testing MyArray class.
 */
public class Main {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(2);

        myArray.add(4);
        myArray.add(5);
        int index = myArray.add(5);
        int a = myArray.get(3);

        myArray.showArray();
    }
}
