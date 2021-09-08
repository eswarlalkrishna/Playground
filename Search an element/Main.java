import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	int i = 0, c = 0;
      	while(i<n){
        	a[i] = sc.nextInt();
          	i++;
        }
      	int s = sc.nextInt();
      	i = 0;
      	while(i<n){
          	if(a[i] == s) c = 1;
          	i++;
        }
    	System.out.print((c == 1)? s +" is present in the array" : s +" is not present in the array");
    }
}