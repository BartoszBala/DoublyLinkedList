package pl.sda.programowanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestConnectedBiDirectionalList {


    ConnectedListBiDirectional<String> listatestowa = new ConnectedListBiDirectional<String>();

    @BeforeEach
    void setup() {
        listatestowa = new ConnectedListBiDirectional<>();
    }


    @Test
    void addTest() {
        assertTrue(listatestowa.isEmpty());
        Throwable e = null;
        assertEquals(0, listatestowa.size());
        try {
            listatestowa.addToPosition("qwerty", 2);
        } catch (Throwable ex) {
            e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);

        assertEquals(0, listatestowa.size());
        listatestowa.addToPosition("test0", 0);
        assertEquals(1, listatestowa.size());
        listatestowa.addToPosition("test 1", 1);
        listatestowa.addToPosition("test 2", 2);

        try {
            listatestowa.get(2);

        } catch (Throwable ex) {
            e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);


        assertEquals(3, listatestowa.size());

        assertEquals("test0", listatestowa.get(0));
        assertEquals("test 1", listatestowa.get(1));
        assertEquals("test 2", listatestowa.get(2));
        listatestowa.addToStart("start");
        assertEquals("start", listatestowa.get(0));
        assertEquals("test 2", listatestowa.get(3));
        listatestowa.remove(2);
        assertEquals("test 2", listatestowa.get(2));
        try {
            listatestowa.set(3, "it doesnt matter");
        } catch (Throwable ex) {
            e = ex;
        }
        ;
        assertTrue(e instanceof IndexOutOfBoundsException);
        listatestowa.remove(2);
        try {
            listatestowa.remove(2);
        } catch (Throwable ex) {
            e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);


        listatestowa.remove(0);
        assertEquals(1, listatestowa.size());

        listatestowa.remove(0);

        assertEquals(0, listatestowa.size());
        assertTrue(listatestowa.isEmpty());

        listatestowa.addToEnd("test");
        assertEquals(1, listatestowa.size());

        listatestowa.set(0, "testseta");

        assertEquals("testseta", listatestowa.get(0));
        assertEquals(1, listatestowa.size());

        listatestowa.get(0);
        listatestowa.add("next test");
        assertEquals("next test",listatestowa.get(1));

        try {
            listatestowa.get(1);


        } catch (Throwable ex) {
            e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);


        try {
            listatestowa.get(1);


        } catch (Throwable ex) {
            e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException || e instanceof NullPointerException);


        try {
            listatestowa.get(9);

        } catch (Throwable ex) {
            e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);

        try {
            listatestowa.set(100, "set");
        } catch (Throwable ex) {
            e = ex;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
    }

}
