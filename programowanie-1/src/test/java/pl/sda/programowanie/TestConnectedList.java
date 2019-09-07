import HomeWork.ConnectedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestConnectedList {

    ConnectedList<String> connectedList;

    @BeforeEach
    void setup() {
        connectedList = new ConnectedList<>();
    }

    @Test
    void sizE_addTest() {
        //given
        String element = "element";
        //when
        int size1 = connectedList.size();
        connectedList.add(element);

        int size2 = connectedList.size();
        connectedList.add(element);


        //then
        connectedList.remove(1);
        int size3 = connectedList.size();
        for (long i = 0; i <  10l; i++) {
            connectedList.add("element");

        }
        int size4 = connectedList.size();
        assertEquals(0, size1);
        assertEquals(1, size2);
        assertEquals(12, size4);
//        assertEquals(0, size3);
//        assertEquals(Integer.MAX_VALUE, size4);


    }

    @Test
    void getTest() {
        connectedList.add("element");
        connectedList.add("element2");
        connectedList.add("element3");
   assertEquals("element",connectedList.get(0));
         assertEquals("element2",connectedList.get(1));
         assertEquals("element3",connectedList.get(2));
//         assertThrows(IndexOutOfBoundsException.class, connectedList.get(3));
         assertEquals("element3",connectedList.get(3));



    }
}