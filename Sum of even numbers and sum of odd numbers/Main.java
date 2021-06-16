import java.util.*;
class Main
{
  public static void main(String args[])
  {
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	int i = 0, sum1 = 0, sum2 = 0;
      	while(i<n){
        	a[i] = sc.nextInt();
          	i++;
        }
      	i = 0;
      	while(i<n){
          	if(a[i] % 2 == 0) sum1 += a[i]; else sum2 += a[i];
          	i++;
        }
    	System.out.println("The sum of the even numbers in the array is " + sum1);
    	System.out.println("The sum of the odd numbers in the array is " + sum2);
  }
}
