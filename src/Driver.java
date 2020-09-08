public class Driver
{
	public static void main(String[] args)
	{
		vowelCount("Philippians");
		vowelCount("Romans");
		vowelCount("Ephesians");
	}
	static void vowelCount(String newTestamentBook)
	{
		String s = newTestamentBook;
		int count = 0;
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A')
			{
				count++;
				countA++;
			}
			else if(s.charAt(i) == 'e' || s.charAt(i) == 'E')
			{
				count++;
				countE++;
			}
			else if(s.charAt(i) == 'i' || s.charAt(i) == 'I')
			{
				count++;
				countI++;
			}
			else if(s.charAt(i) == 'o' || s.charAt(i) == 'O')
			{
				count++;
				countO++;
			}
			else if(s.charAt(i) == 'u' || s.charAt(i) == 'U')
			{
				count++;
				countU++;
			}
		}
		System.out.println("There are " + count + " vowels in " + s + ".");
		System.out.println(countA + " A's");
		System.out.println(countE + " E's");
		System.out.println(countI + " I's");
		System.out.println(countO + " O's");
		System.out.println(countU + " U's");
	}
}