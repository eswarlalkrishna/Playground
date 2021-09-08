import java.util.Scanner;
class Main
{
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	int i = 0;
      	while(i<n){
        	a[i] = sc.nextInt();
          	i++;
        }
    	System.out.println("Maximum element in the array is " + remax(a, a.length));
  }
  static int remax(int[] arr, int len)
  {
    if (len == 1)
      return arr[0];
    return max(remax(arr, len - 1), arr[len - 1]);
  }
 
  private static int max(int n1, int n2)
  {
    return n1 > n2 ? n1 : n2;
  }
}