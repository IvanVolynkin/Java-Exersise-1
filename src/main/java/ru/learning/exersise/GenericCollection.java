package ru.learning.exersise;

/**
 * Created by Ivan.Volynkin on 25.02.2017.
 */
public interface GenericCollection<T> {

    public int add(T elem);

    public T get (int index);

    public T remove (int index);

    public int removeElement (T e);

    public int size();

    public int indexOf(T e);
}
