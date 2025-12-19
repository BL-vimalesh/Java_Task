package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import junit.Mood_Analyser;
import junit.custom_exception;

public class Mood_Analyser_test {

    @Test
    public void givenHappyMessage_shouldReturnHappy() throws custom_exception {
        String result = Mood_Analyser.Analysis("i am very happy");
        assertEquals("happy", result);
    }

    @Test
    public void givenNullMessage_shouldThrowCustomException() {
        try {
            Mood_Analyser.Analysis(null); 
            fail("Expected custom_exception was not thrown");
        } catch (custom_exception e) {
            assertEquals("please enter the input", e.getMessage());
        }
    }
    
    @Test
    public void sad() throws custom_exception {
    	String result = Mood_Analyser.Analysis("i am in sad mood");
    	assertEquals("sad", result);
    }
    
    @Test
    public void Anymood() throws custom_exception {
    	String result = Mood_Analyser.Analysis("i am in any mood");
    	assertEquals("sad", result);
    }
}
