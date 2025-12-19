package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.mood_respond_uc11;

public class uc_testing {
	mood_respond_uc11 mood = new mood_respond_uc11();
	@Test
	public void mood_anayser() {
		String result = mood.respond("i am in sad mood");
		String expected = "sad";
		assertEquals(expected, result);
	}
	
	@Test
	public void mood_anayser2() {
		String result = mood.respond("i am in Any mood");
		String expected = "happy";
		assertEquals(expected, result);
	}
}
