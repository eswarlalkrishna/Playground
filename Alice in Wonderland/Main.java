import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int s = sc.nextInt();
      	if(s>9 || s<100) System.out.println("Alice must go in path-"+(s%10+s/10));
	}
}