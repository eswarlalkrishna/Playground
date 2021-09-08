import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	if (b==0 || b<a) System.out.print(100+b-a);
      	else System.out.print(b-a);
    }
}