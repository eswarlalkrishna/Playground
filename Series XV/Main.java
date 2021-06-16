import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = 3, l = 8, m;
      	System.out.print(k + " " + l + " ");
      	int i = 2;
      	while(i<n){
        	m = k + l + i;
          	System.out.print(m + " ");
          	k = l;
          	l = m;
          	i++;
          	}
	}
}