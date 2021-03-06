package test.epam.learn.action;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.learn.action.ArithmeticArrayAction;
import by.epam.learn.entity.CustomArray;

public class ArithmeticArrayActionTest {
	
	ArithmeticArrayAction arithmetic;
	CustomArray array;
	
	@BeforeClass
	public void setUp() {
		array = new CustomArray(new int[] {3, -8, 42, 7, 0});
		System.out.print(array.toString());
		arithmetic = new ArithmeticArrayAction();
	}
	
	@AfterClass
	public void tearDown() {
		array = null;
		arithmetic = null;
	}
	
	@Test
	public void testMin() {
		
		int actual = arithmetic.min(array);
		System.out.print(actual);
		int expected = -8;
		
		assertEquals(actual, expected);
	}

}
