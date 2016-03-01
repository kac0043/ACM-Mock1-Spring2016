import java.util.*;

public class Egg2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int floors = scan.nextInt(); 
		String[] f = new String[floors+1]; 

		int highest = floors-1;
		int lowest = 2; 

		for (int i = 1; i <= floors; i++)
			f[i] = ""; 

		for (int i = 0; i < n; i++)
		{
			int j = scan.nextInt();
			f[j] = scan.next(); 
		}

		for (int i = 1; i <= floors; i++)
		{
			if (f[i].equalsIgnoreCase("BROKEN"))
			{
				highest = i-1; 
				break; 
			}
		}
		for (int i = floors; i > 0; i--)
		{
			if (f[i].equalsIgnoreCase("SAFE"))
			{
				lowest = i+1; 
				break; 
			}	 
		}

		System.out.println(lowest + " " + highest);

	}
}