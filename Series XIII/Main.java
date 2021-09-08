import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = 5;
      	int i = 1;
      	System.out.print(k + " ");
      	while(i < 2 * (n-1)){
        	k = k + 11 * i;
          	System.out.print(k + " ");
          	i += 2;
        }
	}
}