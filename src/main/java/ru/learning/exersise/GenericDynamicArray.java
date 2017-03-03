package ru.learning.exersise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class for exercise MyArray.
 */
public class GenericDynamicArray<T> implements GenericCollection<T> {

    public static final int DEFAULT_SIZE = 10;

    /**
     *
     */
    private int cursor;

    /**
     *
     */
    private Object[] elements;

    /**
     *
     */
    public GenericDynamicArray() {
        elements = new Object[DEFAULT_SIZE];
        this.cursor = 0;
    }

    /**
     *
     * @param arraySize
     */
    public GenericDynamicArray(int arraySize) {
        elements = new Object[arraySize];
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
        return (T) elements[index];
    }

    /**
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        if (elements.length <= index)
            throw new NoSuchElementException();

        Object deletedElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
        cursor--;
        return (T) deletedElement;
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

    public Iterator<T> iterator() {
        return new GenericDynamicArrayIterator<T>();
    }

    private class GenericDynamicArrayIterator<T> implements Iterator<T> {

        public boolean hasNext() {
            return false;
        }

        public T next() {
            return null;
        }

    }

}
