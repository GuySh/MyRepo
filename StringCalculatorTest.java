/*
 * Guy shimoni
 * id:300308939
 * gitHub login: GuySh
 * */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringCalculatorTest {

	private calculator calc;

	@Before
	public void init()
	{
		calc=new calculator();
	}

	@Test
	public void EmptyZero() throws Exception
	{
		assertEquals(calc.Add(""), 0);
	}

	@Test
	public void oneNumber() throws Exception
	{
		assertEquals(calc.Add("1"), 1);
	}

	@Test
	public void TwoNumbers() throws Exception
	{
		assertEquals(calc.Add("1,2"), 3);
	}

	@Test
	public void lotOfNumbers() throws Exception
	{
		assertEquals(calc.Add("1,2,3,4"), 10);
	}

	@Test
	public void lineBetweenNumbers() throws Exception
	{
		assertEquals(calc.Add("1,2\n3,4"), 10);
	}

	@Test
	public void differentDelimiters() throws Exception
	{
		assertEquals(calc.Add("//g\n1g2"), 3);
	}

	@Test
	public void negativeNumberWillThrowAnException() 
	{
		try
		{
			assertEquals(calc.Add("-1,-3,2"), 1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}





}
