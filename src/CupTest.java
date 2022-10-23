import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.xml.parsers.SAXParser;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    //tester cupCreation men kun indtil der noget som fejler
    void cupCreation(){
        Cup c = new Cup(60,"Soda");
        assertEquals("Soda",c.getLiquidType());
        assertEquals(60, c.getPrecentageFul());
    }

    @Test
    void testEmpty(){
        Cup c = new Cup(5,"Soda");
        assertFalse(c.isEmpty());
    }

    @Test
    void testLiquid(){
        Cup c = new Cup(5,"Soda");
        c.setLiquidType("soda");
        assertNotNull(c.getLiquidType());
    }

   @Disabled("Disabled")
    @Test
    void testFail(){
        //testing disabled
        fail();
    }

    @Test
    //Tester alle asserts selvom en af de ovenstående fejler
    void testObjectCreationWithAssertAll(){
        Cup c = new Cup(5,"Soda");
        assertAll("Creatly build object",
                () ->assertEquals("Soda",c.getLiquidType()),
                () ->assertEquals(5, c.getPrecentageFul()));
    }

    @Test
    //Test if itput is illegal
    void testStupidityOfUser(){
        Cup c = new Cup(75,"Soda");
        assertThrows(IllegalArgumentException.class, () -> c.setPrecentageFul(-1)
                );

    }

}