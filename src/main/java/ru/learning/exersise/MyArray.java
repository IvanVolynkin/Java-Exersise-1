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
    private int arraySize;

    /**
     *
     */
    private int[] myArray;

    /**
     *
     */
    public MyArray() {
        this.arraySize = 10;
        myArray = new int[this.arraySize];
        this.cursor = 0;
    }

    /**
     *
     * @param arraySize
     */
    public MyArray (int arraySize) {
        this.arraySize = arraySize;
        myArray = new int[this.arraySize];
        this.cursor = 0;
    }

    /**
     *
     * @param elem
     * @return
     */
    public int add(int elem) {
        try {
            myArray[cursor] = elem;
        } catch (ArrayIndexOutOfBoundsException e) {
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
