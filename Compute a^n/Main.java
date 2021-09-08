import java.util.Scanner;
class Main
{
    static int raise(int a, int b){
    	if(b == 0) return 1;
      	else if(b == 1) return a;
      	else return a*raise(a, b-1);
        
    }
  	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int m = sc.nextInt();
      	int n = sc.nextInt();
      	System.out.print("The value of " + m + " power " + n + " is " + raise(m, n));
    }
}