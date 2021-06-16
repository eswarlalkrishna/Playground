import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int b = sc.nextInt();
      	int v = sc.nextInt();
      	int s = sc.nextInt();
      	int a = sc.nextInt();
      	int l = sc.nextInt();
      	System.out.print((b*350.34+v*230.90+s*190.55+a*125.30+l*180.90<15000)? "Yes":"No");
	}
}