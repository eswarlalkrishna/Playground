import java.util.Scanner;
class Main
{
	static boolean isFactorial(int n)
	{
		for (int i = 1;; i++)
		{
			if (n % i == 0)	n /= i;
			else break;
		}
		if (n == 1) return true;
		return false;
	}
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
		//boolean ans = isFactorial(n);
		//if (ans == true)
      	System.out.print((isFactorial(n))? "Yes":"No");
		//else System.out.println("No");
	}
}