import java.util.Scanner;
class Main
{
    static int sum(int a){
    	if(a / 10 == 0) return a;
      	else return a % 10 + sum(a/10);
        
    }
  	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int m = sc.nextInt();
      	// int n = sc.nextInt();
      	System.out.print("The sum of digits in " + m + " is " + sum(m));
    }
}