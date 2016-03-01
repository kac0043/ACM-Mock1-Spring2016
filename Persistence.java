import java.util.*;

public class Persistence
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int d = 0; 
		while (s.length() > 1)
		{
			int p = 1; 
			for (int i = 0; i < s.length(); i++)
			{
				p *= Integer.parseInt(s.substring(i, i+1)); 
			}
			s = "" + p; 
			d++; 
		}
		
		System.out.println(d); 


	}
}