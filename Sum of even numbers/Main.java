import java.util.Scanner;
class Main
{
    static int even(int b[], int m, int k)
    {
        if (m < 0) return k;
      	if(b[m] % 2 == 0) k += b[m];
        return even(b, m - 1, k);
    }
  	
  	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	int i = 0, s = 0;
      	while(i < n){
        	a[i] = sc.nextInt();
          	i++;
        }
      	System.out.print("Sum of even numbers " + even(a, n-1, s));
    }
}