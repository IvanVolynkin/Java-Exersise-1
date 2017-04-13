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
        if (!checkIndex(index))
            throw new NoSuchElementException();

        ListNode<T> item;

        if (index <= size/2) {
            item = head;
            for (int i = 0; i < index; i++)
                item = item.next;
        } else {
            item = tail;
            for (int i = size - 1; i > index; i--)
                item = item.previous;
        }

        return item.value;
    }

    private boolean checkIndex(int index) {
        return !(index < 0 || index > (size - 1));
    }

    public T remove(int index) {
        if (!checkIndex(index))
            throw new NoSuchElementException();

        ListNode<T> item;

        if (index <= size/2) {
            item = head;
            for (int i = 0; i < index; i++)
                item = item.next;
        } else {
            item = tail;
            for (int i = size - 1; i > index; i--)
                item = item.previous;
        }

        if (index == 0) {
            item.next.previous = null;
            head = item.next;
        } else if (index == size - 1) {
            item.previous.next = null;
            tail = item.previous;
        } else {
            item.previous.next = item.next;
            item.next.previous = item.previous;
        }
        size--;
        cursor--;
        return item.value;
    }

    public int removeElement(T element) {

        int index;

        ListNode<T> item = head;

        for (index = 0; index < size; index++) {
            if(item.value.equals(element)) {
                remove(index);
                return index;
            }
            item = item.next;
        }
        throw  new NoSuchElementException();
    }

    public int size() {
        return size;
    }

    public int indexOf(T element) {

        int index;

        ListNode<T> item = head;

        for (index = 0; index < size; index++) {
            if (item.value.equals(element))
                return index;
            item = item.next;
        }
        throw new NoSuchElementException();
    }

    public Iterator<T> iterator() {
        return new GenericLinkedListIterator();
    }

    private class GenericLinkedListIterator implements Iterator<T> {

        private ListNode<T> next;
        private int nextIndex;
        private int initialSize;

        public GenericLinkedListIterator() {
            next = head;
            initialSize = size;
        }


        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public T next() {
            if(initialSize != size)
                throw new ConcurrentModificationException();

            if (!hasNext())
                throw new NoSuchElementException();

            ListNode<T> lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.value;
        }
    }

    /**
     *
     * @param
     */
    private class ListNode<U extends T> {

        U value;

        private ListNode<U> previous;

        private ListNode<U> next;

        public ListNode(U element, ListNode<U> previous, ListNode<U> next) {
            this.value = element;
            this.previous = previous;
            this.next = next;
        }
    }
}
