package ru.learning.exersise;

import java.util.Arrays;

/**
 * Class for exercise MyArray.
 */
public class MyArray {

    /**
     *
     */
    private int cursor;

    /**
     *
     */
    private int[] myArray;

    /**
     *
     */
    public MyArray() {
        myArray = new int[10];
        this.cursor = 0;
    }

    /**
     *
     * @param arraySize
     */
    public MyArray (int arraySize) {
        myArray = new int[arraySize];
        this.cursor = 0;
    }

    /**
     *
     * @param elem
     * @return
     */
    public int add(int elem) {
        if(myArray.length > cursor) {
            myArray[cursor] = elem;
        } else {
            myArray = Arrays.copyOf(myArray, cursor + 1);
            myArray[cursor] = elem;
        }
        cursor++;
        return cursor - 1;
    }

    /**
     * This is a test method to show values of array.
     */
    public void showArray() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
