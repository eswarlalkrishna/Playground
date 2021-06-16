import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = 1, i = 1;
     // 	System.out.print("0");
      	while(i<=n){
        	if(i % 2 == 0) System.out.print( i * i - 2 + " ");
            else if(i % 2 == 1) System.out.print( i * i - 1 + " ");
          	i++;
            }
      }
}