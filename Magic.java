import java.util.*;

public class Magic
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble(); 
		//a -= 3;
		//System.out.println(Math.pow(2,31));

		for (int i = 4; i < a; i++)
		{
			double c = a%i;
			if (c == 3)
			{
				System.out.println(i);
				break;
			}
		}
	}
}