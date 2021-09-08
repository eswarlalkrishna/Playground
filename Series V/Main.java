import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = 11;
      	int i = 0;
      	while(i<n){
        	if(i<n-1) System.out.print(m*m + " ");
          	else System.out.print(m*m);
          	m +=4;
          	i++;
        }
	}
}