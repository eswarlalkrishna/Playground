import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = 4;
      	int i = 1;
      	System.out.print(k + " ");
      	while(i<n){
          	k = k + i * i;
        	System.out.print(k + " ");
          	i++;
        }
	}
}