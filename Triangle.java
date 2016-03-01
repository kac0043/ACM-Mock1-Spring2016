import java.util.*;

public class Triangle
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		boolean isT = true; 

		for (int i = 0; i < 3; i++)
		{
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < 3; i++)
		{
			b[i] = scan.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < 3; i++)
		{
			if (a[i] != b[i])
				isT = false; 
		}
		int c = (a[0]*a[0]) + (a[1]*a[1]); 
		int d = a[2]*a[2]; 
		if (c != d)
			isT = false; 

		if (isT)
			System.out.println(1);
		else
			System.out.println(0);

	}
}