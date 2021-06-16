import java.util.Scanner;
class Main
{
  	static int fib(int n){
      	if (n == 1) return 0;
      	else if (n == 2) return 1;
       	else return fib (n - 1) + fib(n - 2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int m = sc.nextInt();
      	System.out.print("The term " + m + " in the fibonacci series is " + fib( m ));
    }
}