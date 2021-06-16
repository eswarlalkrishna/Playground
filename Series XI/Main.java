import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	double k = 20.5;
      	double m = 95.0;
      	int i = 1;
      	System.out.print(m + " ");
      	while(i<n){
        	m = m + k;
          	System.out.print(m + " ");
          	k += 2;
          	i++;
        }
	}
}