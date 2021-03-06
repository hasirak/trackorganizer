package backend;

import java.time.Year;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Test for the Tape class
 */
public class TapeTest {
      
    /**
     * Test of getTapeType method, of class Tape.
     */
    @Test
    public void testGetTapeType() {
         Tape benKing = new Tape("Stand by me", "Ben King", Year.of(1961), "Atco", "4 track");
         assertEquals(benKing.getTapeType(), "4 track");
}

    /**
     * Test of setTapeType method, of class Tape.
     */
    @Test
    public void testSetTapeType() {
         Tape benKing = new Tape("Stand by me", "Ben King", Year.of(1961), "Atco", "4 track");
         benKing.setTapeType("8 track");
         assertEquals(benKing.getTapeType(), "8 track");
    }
     /**
     * Test of getName method, of class Tape.
     */    
    @Test
    public void testGetName() {
         Tape benKing = new Tape("Stand by me", "Ben King", Year.of(1961), "Atco", "8 track");
         assertEquals(benKing.getName(), "Stand by me");
    }
     /**
     * Test of setName method, of class Tape.
     */    
    @Test
    public void testSetName() {
         Tape benKing = new Tape("Stand by me", "Ben King", Year.of(1961), "Atco", "8 track");
         benKing.setName("This magic moment");
         assertEquals(benKing.getName(), "This magic moment");
    }
    
}