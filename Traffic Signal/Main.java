import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	float s = sc.nextFloat();
      	float d = sc.nextFloat();
      	float t = sc.nextFloat();
      	System.out.print(((s/d)>=t)? "Yes":"No");
	}
}