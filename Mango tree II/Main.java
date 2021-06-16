import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int r = sc.nextInt();
      	int c = sc.nextInt();
      	int n = sc.nextInt();
      	System.out.print((n%r==1 || n<=c || n>r*(c-1))? "yes":"No"); 
	}
}