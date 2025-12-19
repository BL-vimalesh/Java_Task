package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junit.Mood_Analyser;

public class MoodAnalyserTest {
    Mood_Analyser mood = new Mood_Analyser();

    @Test
    public void testAnalyserHappy() {
        String result = mood.Analyser("I am very Happy");
        String expected = "happy";
        assertEquals(expected, result);
    }
    
    @Test
    public void testAnalyserHappy2() {
        String result = mood.Analyser("I am very sad");
        String expected = "sad";
        assertEquals(expected, result);
    }
    
    @Test
    public void testAnalyserHappy3() {
        String result = mood.Analyser("I am very netural");
        String expected = "netural";
        assertEquals(expected, result);
    }
    
    
    @Test
    public void testAnalyserHappy5() {
        String result = mood.Analyser("I am very unknown");
        String expected = "unknown";
        assertEquals(expected, result);
    }
}
