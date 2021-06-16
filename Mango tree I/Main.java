import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int r = sc.nextInt();
      	int c = sc.nextInt();
      	int n = sc.nextInt();
      	System.out.print((n<=c+1 || n%c==0 || n%c==1)? "Yes":"No"); 
	}
}