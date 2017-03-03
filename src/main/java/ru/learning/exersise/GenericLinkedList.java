package ru.learning.exersise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;

/**
 * Created by Ivan.Volynkin on 25.02.2017.
 */
public class GenericLinkedList<T> implements GenericCollection<T> {

    private int size;

    private int cursor;

    private ListNode<T>  head;

    private ListNode<T> tail;

    public GenericLinkedList() {

    }

    public GenericLinkedList(GenericCollection<T> collection) {

    }

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
        return null;
    }

    public T remove(int index) {
        return null;
    }

    public int removeElement(T e) {
        return 0;
    }

    public int size() {
        return 0;
    }

    public int indexOf(T e) {
        return 0;
    }

    public Iterator<T> iterator() {
        return new GenericLinkedListIterator<T>();
    }

    private class GenericLinkedListIterator<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    /**
     *
     * @param <T>
     */
    class ListNode<T> {

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

        ListNode<T> next(){
            return next;
        }

        ListNode<T> previous() {
            return previous;
        }
    }
}
