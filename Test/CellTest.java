import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CellTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//Test convertToInt()
	//Cell Class has two different kind of constructors, test three different kinds of input
	
	//Test alive cell, which should return "X"
	@Test
	public void testtoStringwithTrue() {
		Cell cell = new Cell(true);
		String result = cell.toString();
		assertEquals("X",result);
	}
	
	//Test dead cell, which should return "."
	@Test
	public void testtoStringithFalse() {
		Cell cell = new Cell(false);
		String result = cell.toString();
		assertEquals(".",result);
	}
	
	//Test cell without argument when initialize, which should return "."
	@Test
	public void testtoStringwithEmpty() {
		Cell cell = new Cell();
		String result = cell.toString();
		assertEquals(".",result);
	}


}
