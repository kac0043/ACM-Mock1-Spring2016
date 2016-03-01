import java.util.*;

public class Simple
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int[] a = new int[26];
		
		for (int i = 0; i < 26; i++)
		{
			a[i] = 0; 
		}

		for (int i = 0; i < s.length(); i++)
		{
			Character b = s.charAt(i);
			int v = b.getNumericValue(b)-10;
			a[v]++; 
		}

		Arrays.sort(a); 

		int d = 0; 
		for (int i = 23; i >= 0; i--)
		{
			d += a[i]; 
		}

		System.out.println(d);

	}
}