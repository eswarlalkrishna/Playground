import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int i = 1;
      	while(i<=n){
          	if(i<n) System.out.print(i * i + " ");
          	else System.out.print(i * i);
          	i++;
        }
	}
}