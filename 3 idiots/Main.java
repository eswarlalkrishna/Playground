import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  		Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	float f1 = (float)(a+c)/2;
    	float f2 = (float)(b+d)/2;
    	System.out.println("Binoy's house is located at ("+ f1 + "," + f2 +")");
  }
}