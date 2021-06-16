import java.util.Scanner;
class Main
{
  	static int gcd(int a, int b){
    	if (b == 0) return a;
      	else return gcd(b,a % b);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int m = sc.nextInt();
      	int n = sc.nextInt();
      	System.out.print("G.C.D of " + m + " and " + n + " is " + gcd(m,n));
    }
}