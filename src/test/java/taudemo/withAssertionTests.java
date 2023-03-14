package taudemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class withAssertionTests {

    @Test
    public void firstAssertionTest(){
        assertEquals(  2,  2);

    }    @Test
    public void secondAssertionTest(){
        assertEquals(  45,  45);
    }

}
