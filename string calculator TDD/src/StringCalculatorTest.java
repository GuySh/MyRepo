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

}
