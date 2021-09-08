import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	int i = 0, max = 0;
      	while(i<n){
        	a[i] = sc.nextInt();
          	i++;
        }
      	i = 0;
      	while(i<n){
        	if (max < a[i]) max = a[i];
          	i++;
        }
      	System.out.print(max + " is the maximum element in the array");
    }
}