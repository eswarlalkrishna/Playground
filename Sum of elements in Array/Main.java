import java.util.Scanner;
class Main
{
  	static int sum(int a[], int m)
    {
        if (m <= 0)
            return 0;
        return (sum(a, m - 1) + a[m - 1]);
    }
  	
  	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	int i = 0;
      	while(i < n){
        	a[i] = sc.nextInt();
          	i++;
        }
      	System.out.print("The sum of the elements in the array is " + sum( a, n));
    }
}