package com.stackroute.p3.practiceExercise4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HarryWordCheckerTest 
{
	
	private static HarryWordChecker harryWordChecker;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		harryWordChecker = new HarryWordChecker();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		harryWordChecker = null;

	}
	
	@Test
	public void testHarryWordChecker() {
		assertTrue(harryWordChecker.isHarryPresent("This is Harry."));
		assertFalse(harryWordChecker.isHarryPresent("This is Henry."));
	}
}
