import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	double m = 0.5;
      	int i = 0;
      	System.out.print(m + " ");
      	while(i<n-1){
        	m *=3;
          	if(i<n-2) System.out.print(m + " ");
          	else System.out.print(m);
          i++;
        }
	}
}