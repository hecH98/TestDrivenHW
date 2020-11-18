package testing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyTests {

    // Unit testing for list size
    @Test
    public void getSizeOfList() {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('n');
        list.add('v');

        assertEquals(4, list.size());
    }

    @Test
    public void getSizeOfListEmpty() {
        List<Character> list = new ArrayList<>();

        assertEquals(0, list.size());
    }

    @Test
    public void getSizeOfListWhenAddingElements() {
        List<Character> list = new ArrayList<>();
        list.add('d');
        list.add('e');
        list.add('e');
        list.add('o');

        assertEquals(4, list.size());

        list.add('5');

        assertEquals(5, list.size());
    }

    // Unit testing for clearing the list
    @Test
    public void clearList() {
        List<Character> list = new ArrayList<>();
        list.add('q');
        list.add('g');
        list.add('u');
        list.add('o');

        list.clear();

        assertEquals(0, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void clearList2() {
        List<Character> list = null;

        list.clear();
    }

    @Test
    public void clearList3() {
        List<Character> list = new ArrayList<>();
        list.add('q');
        list.add('g');
        list.add('u');
        list.add('o');

        list.clear();

        list.add('g');
        list.add('o');

        assertEquals(2, list.size());
    }

    // We need to add Items
    @Test
    public void addItems() {
        List<Character> list = new ArrayList<>();
        list.add('q');
        list.add('g');

        assertEquals(2, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void addItems2() {
        List<Character> list = null;
        list.add('g');
    }

    @Test
    public void addItems3() {
        List<Character> list = new ArrayList<>();
        list.add('q');

        list.clear();

        list.add('q');

        assertEquals(1, list.size());
    }

    // We need to be able to check if an item exists
    @Test
    public void itemsExist() {
        List<Character> list = new ArrayList<>();
        list.add('q');

        assertTrue(list.contains('q'));
    }

    @Test(expected = NullPointerException.class)
    public void itemsExist2() {
        List<Character> list = null;
        list.contains('o');
    }

    @Test
    public void itemsExist3() {
        List<Character> list = new ArrayList<>();
        list.add('q');

        list.clear();

        list.add('x');

        assertFalse(list.contains('q'));
    }

    // We need to get elements by index
    @Test
    public void getElementByIndex() {
        List<Character> list = new ArrayList<>();
        list.add('q');

        assertEquals('q', list.get(0).charValue());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementByIndex2() {
        List<Character> list = new ArrayList<>();
        list.add('o');

        list.get(8);
    }

    @Test(expected = NullPointerException.class)
    public void getElementByIndex3() {
        List<Character> list = null;
        list.get(0);
    }

    // We need to search the index of an object
    @Test
    public void indexOf() {
        List<Character> list = new ArrayList<>();
        list.add('q');
        list.add('e');
        list.add('h');

        assertEquals(0, list.indexOf('q'));
    }

    @Test
    public void indexOf2() {
        List<Character> list = new ArrayList<>();
        list.add('o');

        assertEquals(-1, list.indexOf('q'));
    }

    @Test(expected = NullPointerException.class)
    public void indexOf3() {
        List<Character> list = null;
        list.indexOf('i');
    }

    // We need to remove an item by index
    @Test
    public void remove() {
        List<Character> list = new ArrayList<>();
        list.add('q');
        list.add('e');
        list.add('h');

        list.remove(1);

        assertFalse(list.contains('e'));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove2() {
        List<Character> list = new ArrayList<>();
        list.add('o');
        list.add('v');
        list.add('e');
        list.add('u');

        list.remove(8);
    }

    @Test(expected = NullPointerException.class)
    public void remove3() {
        List<Character> list = null;
        list.indexOf('i');
        list.indexOf('o');
        list.indexOf('e');
        list.indexOf('j');

        assertEquals('e', list.remove(2).charValue());
    }
}