import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalculatorTest {

	@Test
	public void EmptyZero() throws Exception
	{
		calc=new calculator();
		assertEquals(calc.Add(""), 0);
	}

}
