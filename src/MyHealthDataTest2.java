import static org.junit.Assert.*;

import org.junit.Test;
/**
 * <p>This class provides two tests for getBMI using Junit, one that passes and one that fails.</p>
 * @author Braden Howard
 */
public class MyHealthDataTest2 {
	/**
	 * <p> This method tests the getBMI with correct values. It checks whether the value that was calculated 
	 * with a calculator equals the value calculated by the method getBMI with a delta of 0.000001.</p>
	 */
	@Test
	public void testGetBMI() {// Learned how to use JUnit from hybrids, citing at bottom of code [1].
		Patient patient = new Patient(null, null, null, 0, 0, 0, 0, 0);
		
		patient.setWeight(150);// Sets weight to 150 pounds 
		patient.setHeight(67);// Sets height to 67 inches
		
		double result = patient.getBMI();// calls getBMI method in patients class
		assertEquals(23.490755, result, .000001);// Checks if results are equal
		System.out.print("Test1 successfully passed.");
	}
	/**
	 * <p> This method tests the getBMI with incorrect values. It uses 0 for the height, when calculated with a calculator it
	 * gets 0, but the getBMI method will return infinity, resulting in a failure.</p>
	 */
	@Test
	public void testGetBMI2() {
		Patient patient2 = new Patient(null, null, null, 0, 0, 0, 0, 0);
		
		patient2.setWeight(150);// Sets weight to 150 pounds
		patient2.setHeight(0);// Sets height to 0 inches tall
		
		double result = patient2.getBMI();// calls getBMI method in patients class
		// Used an if statement to get a message to print if the test was successful or failed
		if (0 != result) {
		System.out.printf("Test failed, calculated result does not equal: %.5f\n", result);} else
			System.out.println("Test2 was successfull");
		assertEquals(0, result, .000001);// Checks if results are equal
		}
	}

/*
 * References:
 * Learned how to use Junit from the hyrbid link to courses.cs.washington.edu.
 * [1] Using JUnit in Eclipse. courses.cs.washington.edu
 * https://courses.cs.washington.edu/courses/cse143/11wi/eclipse-tutorial/junit.shtml (accessed June 19, 2023).
 */
		

