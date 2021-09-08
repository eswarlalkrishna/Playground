import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	int b[] = new int[n];
      	int i = 0;
      	while(i<n){
        	a[i] = sc.nextInt();
          	i++;
        }
      	i = 0;
      	while(i<n){
        	b[i] = sc.nextInt();
          	i++;
        }
      	i = 0;
      	while(i<n){
          	System.out.println(a[i] + b[i]);
          	i++;
        }
    }
}