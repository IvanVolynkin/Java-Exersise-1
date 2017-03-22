package ru.learning.exersise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by Ivan.Volynkin on 22.03.2017.
 */
public class GenericLinkedListTest {

    GenericLinkedList<Integer> listInteger;

    @Before
    public void beforeTest() {
        listInteger = new GenericLinkedList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(10);
        listInteger.add(11);
        listInteger.add(12);
        listInteger.add(13);
        listInteger.add(14);
    }

    @Test
    public void add() throws Exception {

    }

    @Test
    public void get() throws Exception {
        Assert.assertTrue(listInteger.get(0) == 1);

        Assert.assertTrue(listInteger.get(9) == 14);

        Assert.assertTrue(listInteger.get(4) == 5);

        try {
            listInteger.get(10);
            Assert.fail();
        } catch (NoSuchElementException e) {}

        try {
            listInteger.get(-1);
            Assert.fail();
        } catch (NoSuchElementException e) {}
    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void removeElement() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

    @Test
    public void indexOf() throws Exception {

    }

    @Test
    public void iterator() throws Exception {

    }

}