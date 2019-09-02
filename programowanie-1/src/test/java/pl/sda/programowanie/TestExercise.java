package pl.sda.programowanie;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestExercise {

    @Test
    void isAdultTest() {
        Exercise exercise = new Exercise();
        assertAll("age",
                () -> assertTrue(exercise.isAdult(20)),
                () -> assertFalse(exercise.isAdult(10)),
                () -> assertTrue(exercise.isAdult(18))
        );
    }

    @Test
    void returnArrayStringTest() {
        //given
        int[] array = {1, 2, 3, 7, 12, 18};
        String expected = "1,2,3,7,12,18";
        int[] array2 = {};
        String expected2 = "";

        //when
        Exercise exercise = new Exercise();

        //then
        assertEquals(expected, exercise.arrayToStringForKoks(array));
        assertEquals(expected2, exercise.arrayToStringForKoks(array2));
    }

    @Test
    void multiplyTest() {
        Exercise exercise = new Exercise();
        assertEquals(35, exercise.multiply(5, 7));
        assertEquals(40, exercise.multiply(4, 10));
    }

    @Test
    void returnArrayStringReverseTest(){
        // given
        int[] array = {1,2,3,7,12,18};
        String expected = "18,12,7,3,2,1";
        int[] expected3 = {1,2,3,7,12,18};
        int[] array2 = {};
        String expected2 = "";

        Exercise exercise = new Exercise();
        assertAll("Table Backwards",
                () -> assertEquals(expected, exercise.tableBackward(array)),
                () -> assertEquals(expected2, exercise.tableBackward(array2)),
                () -> assertArrayEquals(expected3, array)
        );
    }

    @Test
    void arrayToStringDivideBy3Test() {
        int[] array = {1, 2, 3, 7, 12, 18};
        String expected = "3,12,18";
        int[] array2 = {};
        String expected2 = "";
        int[] array3 = {1, 4, 7, 13};
        String expected3 = "";

        Exercise exercise = new Exercise();
        assertEquals(expected, exercise.arrayToStringDivideBy3(array));
        assertEquals(expected2, exercise.arrayToStringDivideBy3(array2));
        assertEquals(expected3, exercise.arrayToStringDivideBy3(array3));
    }
}
