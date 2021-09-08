import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int i = 0, p = 0, c = 0;
      	while(i<n){
          	int a = sc.nextInt();
        	if (a >= 0) p++;
          	else c++;
          	i++;
        }
      	System.out.print("Number of positive numbers is " + p + " and the number of negative numbers is " + c);
    }
}