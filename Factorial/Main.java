import java.util.Scanner;
class Main
{
  	static int fact(int f){
    	if(f == 0 || f == 1) return 1;
      	else return f * fact(f - 1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	System.out.print("The factorial of " + n + " is " + fact(n) );
    }
}