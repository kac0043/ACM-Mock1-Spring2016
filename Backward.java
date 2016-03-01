import java.util.*;

public class Backward
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] output = new String[n];
		String s = ""; 

		for (int i = 0; i < n; i++)
		{
			String k = scan.nextLine(); 
			for (int j = k.length()-1; j >= 0; j--)
			{
				s = s + k.charAt(j);
			}
			output[i] = s;
			s = ""; 
		} 

		Arrays.sort(output);
		for (int i = 0; i < n; i++)
		{
			System.out.println(output[i]);
		}

		
		
	}
}