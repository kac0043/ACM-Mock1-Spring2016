import java.util.*;

public class Excellence
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int[] b = new int[n]; 
		for (int i = 0; i < n; i++)
		{
			b[i] = scan.nextInt(); 
		}
		Arrays.sort(b);

		int[] a = new int[n/2]; 
		for (int i = 0; i < n/2; i++)
		{
			a[i] = b[i] + b[(n-i)-1]; 
		}

		Arrays.sort(a);
		System.out.println(a[0]);

	}
}