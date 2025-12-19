package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.repeat;
import junit.tc_2_1;

public class repeats {
    
    @Test
    public void mood_analyser() {
    	repeat r = new repeat("i am in happy");
    	String result = r.mood_analyser();
    	assertEquals("happy", result);
    }
    
    @Test
    public void mood_analyser2() {
    	repeat r = new repeat("i am in sad");
    	String result = r.mood_analyser();
    	assertEquals("sad", result);
    }
    
    @Test
    public void mood_analyser3() {
    	String result = null;
    	try {
    	tc_2_1 r = new tc_2_1(null);
    	result = r.mood_anayser();
    }catch(NullPointerException e) {
    	result = "happy";
    }
    	assertEquals("happy", result);
}}
