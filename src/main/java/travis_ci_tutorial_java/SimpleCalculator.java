package travis_ci_tutorial_java;

public class SimpleCalculator 
{
	public int add(int a, int b) 
	{
		return a + b;
	}
	
	/**
	 * Perform subtraction on the two operands.
	 * 
	 * @param first the first operand
	 * @param second the second operand
	 * 
	 * @return the difference between the two operands
	 */
	public int subtract(int first, int second)
	{
		return first - second;
	}
	
	/**
	 * Perform multiplication on the two operands.
	 * 
	 * @param first the first operand
	 * @param second the second operand
	 * 
	 * @return the product of the two operands
	 */
	public int multiply(int first, int second)
	{
		return first * second;
	}
	
	/**
	 * Perform integer division on the two operands.
	 * (Divide and apply the floor function to the resulting value)
	 * 
	 * @param first the first operand
	 * @param second the second operand
	 * 
	 * @return the quotient of the two operands
	 */
	public int divide(int first, int second)
	{
		return first / second;
	}
}
