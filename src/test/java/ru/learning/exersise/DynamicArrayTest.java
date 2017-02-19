package ru.learning.exersise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ivan.Volynkin on 17.02.2017.
 */
public class DynamicArrayTest {

    private DynamicArray dynamicArray;

    @Before
    public void init() {

    }

    @Test
    public void add() throws Exception {
        dynamicArray = new DynamicArray();

        assertEquals(0, dynamicArray.add(1));

        dynamicArray = new DynamicArray(20);

        assertEquals(0, dynamicArray.add(1));

        dynamicArray = new DynamicArray(5);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);

        assertEquals(5, dynamicArray.add(6));
    }

    @Test
    public void get() throws Exception {

    }

    @Test(expected = NoSuchElementException.class)
    public void remove() throws Exception {
        dynamicArray = new DynamicArray(20);

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);

        Assert.assertEquals(7, dynamicArray.remove(6));

        dynamicArray.remove(20);
    }

    @Test
    public void indexOf() {
        dynamicArray = new DynamicArray();

        for (int i = 1; i < 11; i++) {
            dynamicArray.add(i);
        }

        for (int i = 1; i < 11; i++) {
            Assert.assertEquals(i - 1, dynamicArray.indexOf(i));
        }
    }

}