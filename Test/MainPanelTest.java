import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MainPanelTest {
	public Method convertToInt;
	
	MainPanel mainpanel = new MainPanel(15);

	@Before
	public void setUp() throws Exception {
		convertToInt = MainPanel.class.getDeclaredMethod("convertToInt", int.class);
		convertToInt.setAccessible(true);		
	}

	@After
	public void tearDown() throws Exception {
	}

	//Tests designed based on equivalance class
	//Positive Number, zero, Negative Number
	//Edge Case: Max_VALUE(positive) and MIN_VALUE(negative); Happy Path: Normal Number
	
	
	//Test with the edge case of negative number
	//As the original method, when the input is negative, a NumberFormatException will be thrown.
	@Test
	public void testconvertToIntNegativeInputException() throws IllegalArgumentException, InvocationTargetException, IllegalAccessException {		
		try{
			int output = (int) convertToInt.invoke(mainpanel, Integer.MIN_VALUE);
			//An exception is thrown here
			fail("NumberFormatException");	
			} catch (InvocationTargetException e) {
				e.getMessage();
			}
	}
	
	//Test with the edge case of positive number as input, the output should be the same as the input
	@Test
	public void testconvertToIntTestPositiveInput() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int output = (int) convertToInt.invoke(mainpanel, Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE, output);
	}
	
	//Test with zero as input, the output should be the same as the input
	@Test
	public void testconvertToIntTestZero() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int output = (int) convertToInt.invoke(mainpanel, 0);
		assertEquals(0, output);
	}
	
	//Test happy path which is a normal positive number, the output should be the same as the input
	@Test
	public void testconvertToIntTestGeneralNumber() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int output = (int) convertToInt.invoke(mainpanel, 5);
		assertEquals(5, output);
	}
	
	
	
	

}
