import java.util.*;
class Main
{
  	public static void main(String args[])
  	{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a[] = new int[n];
    	int i = 0, e = 0, o = 0, m = 0;
    	while(i < n){
        	a[i] = sc.nextInt();
          	i++;
        }
    	i = 0;
      	while(i < n){
        	if (a[i] % 2 == 0) e ++;
          	else if (a[i] % 2 == 1) o ++;
          	i++;
        }
      	if (e == n) System.out.print("The array is Even");
      	else if (o == n) System.out.print("The array is Odd");
      	else System.out.print("The array is Mixed");
  }
}