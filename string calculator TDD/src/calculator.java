
public class calculator {

	public int Add(String str)
	{
		if(isEmpty(str))
		{
			return 0;
		}
		else
		{
			if(str.length() == 1)
			{
				return Integer.parseInt(str);
			}
			String[] numbers=str.split(",");
			return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		}
	}

	public boolean isEmpty(String str)
	{
		return str.isEmpty();
	}
}
