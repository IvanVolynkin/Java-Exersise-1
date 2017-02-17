package ru.learning.exersise;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Class for exercise MyArray.
 */
public class DynamicArray {

    /**
     *
     */
    private int cursor;

    /**
     *
     */
    private int[] elements;

    /**
     *
     */
    public DynamicArray() {
        elements = new int[10];
        this.cursor = 0;
    }

    /**
     *
     * @param arraySize
     */
    public DynamicArray(int arraySize) {
        elements = new int[arraySize];
        this.cursor = 0;
    }

    /**
     *
     * @param elem
     * @return
     */
    public int add(int elem) {
        if(elements.length > cursor) {
            elements[cursor] = elem;
        } else {
            elements = Arrays.copyOf(elements, elements.length + elements.length/2);
            elements[cursor] = elem;
        }
        cursor++;
        return cursor - 1;
    }

    /**
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index >= elements.length)
            throw new NoSuchElementException();
        return elements[index];
    }

    /**
     *
     * @param index
     * @return
     */
    public int remove(int index) {
        if (elements.length <= index)
            throw new NoSuchElementException();

        int deletedElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        cursor--;
        return deletedElement;
    }

    /**
     *
     * @param e
     * @return
     */
    public int removeElement(int e) {
        for (int i = 0; i < elements.length; i++) {
            if (e == elements[i]) {
                remove(i);
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /**
     *
     * @return
     */
    public int size() {
        return cursor - 1;
    }

    /**
     *
     * @param e
     * @return
     */
    public int indexOf(int e) {
        for (int i = 0; i < elements.length; i++) {
            if (e == elements[i])
                return i;
        }

        return -1;
    }

    /**
     * This is a test method to show values of array.
     */
    public void showArray() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
