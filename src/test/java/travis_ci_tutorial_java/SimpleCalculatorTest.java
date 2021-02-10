package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest 
{
	@Test
	public void testAdd() 
	{
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2); // changed from 0 back to 2
	}
	
	@Test
	public void testSubtract()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.subtract(5, 3), 2);
	}
}
