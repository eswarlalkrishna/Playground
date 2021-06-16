import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	double k = 1;
      	double j = 2;
      	int i = 1;
      	System.out.print((int)k + " " + j + " ");
      	if(n % 2 == 0){
      	while(i<n/2){
          	k *= 3.0;
          	j *= 3.0;
        	System.out.print(k + " " + j + " ");
          	i++;
        }
        }
      	else if(n % 2 == 1){
      	while(i < n/2){
          	k *= 3.0;
          	j *= 3.0;
        	System.out.print(k + " " + j + " ");
          	i++;
        }
          System.out.print(k * 3.0);
        }
      		
	}
}