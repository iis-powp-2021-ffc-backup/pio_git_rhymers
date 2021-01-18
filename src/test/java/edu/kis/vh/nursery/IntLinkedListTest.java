package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListTest {

    IntLinkedList list;
    @Before
    public void initializeList() {
        list = new IntLinkedList();
    }

    @Test
    public void testPush() {
        for (int i = -5; i < 15; i++) {
            list.push(i);
            Assert.assertEquals(i, list.top());
        }
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(list.isEmpty());
        list.push(1);
        Assert.assertFalse(list.isEmpty());
        list.pop();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testTestIsFull() {
        Assert.assertFalse(list.isFull());
        list.push(1);
        Assert.assertFalse(list.isFull());

        for (int i = 1; i < IntLinkedList.MAX_SIZE - 1; i++) {
            list.push(i);
        }
        Assert.assertFalse(list.isFull());
        list.push(1);
        Assert.assertTrue(list.isFull());
    }

    @Test
    public void testTop() {
        for (int i = -30; i < 100; i++) {
            list.push(i);
            Assert.assertEquals(i, list.top());
        }
    }

    @Test
    public void testPop() {
        for (int i = -30; i < 100; i++) {
            list.push(i);
            Assert.assertEquals(i, list.pop());
        }
        Assert.assertTrue(list.isEmpty());
    }
}