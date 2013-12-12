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
	public void EmptyZero()
	{
		assertEquals(calc.Add(""), 0);
	}
	
	@Test
	public void oneNumber()
	{
		assertEquals(calc.Add("1"), 1);
	}
	
	@Test
	public void TwoNumbers()
	{
		assertEquals(calc.Add("1,2"), 3);
	}

	@Test
	public void lotOfNumbers() throws Exception
	{
		assertEquals(calc.Add("1,2,3,4"), 10);
	}

}
