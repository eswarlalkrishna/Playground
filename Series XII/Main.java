import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = 9, l = 2;
      	System.out.print(k + " ");
      	int i = 1 , m = 0;
      	while(i<n){
        	m = k + l;
          	System.out.print(m + " ");
          	l = k ;
          	k = m ;
          	i++;
        }
	}
}