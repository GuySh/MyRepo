/*
 * Guy shimoni
 * id:300308939
 * gitHub login: GuySh
 * */

public class calculator {

	public int Add(String str) throws Exception
	{
		if(isEmpty(str))
		{
			return 0;
		}
		else 
		{
			String[] numbers=str.split("[,\n]+");

			int i=0;
			char c;
			try
			{
			Integer.parseInt(numbers[0]);
			}
			catch(NumberFormatException e)
			{
				c=numbers[0].charAt(2);
				str=str.replace(c, ',');
				numbers=str.split("[,\n]+");
				i=1;
				
			}
			
			
			int sum=0;
			for(  ; i<numbers.length ; i++)
			{
				if(Integer.parseInt(numbers[i]) < 0)
				{
					String temp=" ";
					for(int j=i ; j<numbers.length ; j++)
					{
						if(Integer.parseInt(numbers[j]) < 0)
						{
							temp+=numbers[j]+" ";
						}
					}
					
					throw new Exception("negatives not allowed" + temp);
				}
				sum=sum+Integer.parseInt(numbers[i]);
			}
			return sum;

		}

	}

	public boolean isEmpty(String str)
	{
		return str.isEmpty();
	}
}

