package ru.learning.exersise;

import java.util.*;

/**
 * Created by Ivan.Volynkin on 25.02.2017.
 */
public class GenericLinkedList<T> implements GenericCollection<T> {

    private int size = 0;

    private int cursor = 0;

    private ListNode<T> head;

    private ListNode<T> tail;

    /**
     *
     */
    public GenericLinkedList() {

    }

    /**
     *
     * @param collection
     */
    public GenericLinkedList(GenericCollection<T> collection) {
        for (T element : collection) {
            add(element);
        }
    }

    /**
     *
     * @param elem
     * @return
     */
    public int add(T elem) {
        final ListNode<T> currentTail = tail;
        final ListNode<T> newListNode = new ListNode<>(elem, currentTail, null);
        tail = newListNode;
        if (currentTail == null)
            head = newListNode;
        else {
            currentTail.next = newListNode;
            cursor++;
        }
        size++;
        return cursor;
    }

    public T get(int index) {
        int counter = 0;
        for (T element: this) {
            if (counter == index)
                    return element;
            counter++;
        }
        return null;
    }

    public T remove(int index) {
        return null;
    }

    public int removeElement(T e) {
        return 0;
    }

    public int size() {
        return size;
    }

    public int indexOf(T e) {
        return 0;
    }

    public Iterator<T> iterator() {
        return new GenericLinkedListIterator<T>();
    }

    private class GenericLinkedListIterator<T> implements Iterator<T> {

        private ListNode<T> lastReturned;
        private ListNode<T> next;
        private int nextIndex;

        public GenericLinkedListIterator() {
            next = (ListNode<T>) head;
        }


        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.value;
        }
    }

    /**
     *
     * @param <T>
     */
    private class ListNode<T> {

        T value;

        private int state;

        private ListNode<T> previous;

        private ListNode<T> next;

        public ListNode(T element, ListNode<T> previous, ListNode<T> next) {
            this.state = 0;
            this.value = element;
            this.previous = previous;
            this.next = next;
        }
    }
}
