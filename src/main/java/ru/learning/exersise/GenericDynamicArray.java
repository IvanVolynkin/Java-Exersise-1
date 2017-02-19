package ru.learning.exersise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Class for exercise MyArray.
 */
public class GenericDynamicArray<T> {

    public static final int DEFAULT_SIZE = 10;

    /**
     *
     */
    private int cursor;

    /**
     *
     */
    private T[] elements;

    /**
     *
     */
    public GenericDynamicArray(Class<T> type) {
        elements = (T[]) Array.newInstance(type , DEFAULT_SIZE);
        this.cursor = 0;
    }

    /**
     *
     * @param arraySize
     */
    public GenericDynamicArray(Class<T> type, int arraySize) {
        elements = (T[]) Array.newInstance(type, arraySize);
        this.cursor = 0;
    }

    /**
     *
     * @param elem
     * @return
     */
    public int add(T elem) {
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
    public T get(int index) {
        if (index >= elements.length)
            throw new NoSuchElementException();
        return elements[index];
    }

    /**
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        if (elements.length <= index)
            throw new NoSuchElementException();

        T deletedElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        cursor--;
        return deletedElement;
    }

    /**
     *
     * @param e
     * @return
     */
    public int removeElement(T e) {
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
    public int indexOf(T e) {
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
