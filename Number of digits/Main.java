import java.util.Scanner;
class Main
{
    static int count(int a){
    	if(a / 10 == 0) return 1;
      	else return 1 + count(a/10);
        
    }
  	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int m = sc.nextInt();
      	// int n = sc.nextInt();
      	System.out.print("The number of digits in " + m + " is " + count(m));
    }
}