import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = 2;
      	System.out.print(k + " ");
      	int i = 2;
      	while(i <= n){
        	k = k * 2 + 1;
          	System.out.print(k + " ");
          	i ++ ;
        }
	}
}