import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 	int x = 1;
    	int y = n * n + 1;
    	for (int i = n; i >= 1; i--){
		for (int k = 0; k < n - i; k++) System.out.printf(" ");
		for (int j = 0; j < i; j++) System.out.printf("%d*", x++);
		for (int l = 0; l < i - 1; l++) System.out.printf("%d*", y++);
		System.out.printf("%d\n", y);
		y -= 2*(i - 1);
  		}
	}
}