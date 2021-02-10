package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest 
{
	
	//============================ Add() ================================
	
	@Test
	public void testAdd() 
	{
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2); // changed from 0 back to 2
	}
	
	@Test
	public void testAddWithNegatives()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.add(-1, -9), -10); 
	}
	
	@Test
	public void testAddWithNegativeAndPositive()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.add(-1, 9), 8); 
	}
	
	//============================ Subtract() ============================
	
	@Test
	public void testSubtract()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.subtract(5, 3), 2);
	}
	
	@Test
	public void testSubtractWithNegativesFirstOperandGreater()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.subtract(-5, -3), -2);		
	}
	
	@Test
	public void testSubtractWithNegativesSecondOperandGreater()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.subtract(-3, -5), 2);		
	}	
	
	@Test
	public void testSubtractWithPositiveAndNegative()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.subtract(5, -3), 8);
	}
	
	//============================ Multiply() ============================
	
	@Test
	public void testMultiply()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.multiply(5, 3), 15);
	}
	
	@Test
	public void testMultiplyWithNegatives()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.multiply(-5, -3), 15);
	}
	
	@Test 
	public void testMultiplyWithPositiveAndNegative()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.multiply(5, -3), -15);
	}
	
	//============================ Divide() ==============================
	
	@Test 
	public void testDivide()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		assertEquals(calculator.divide(15, 3), 5);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivideByZero()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.divide(15, 0);
	}
}