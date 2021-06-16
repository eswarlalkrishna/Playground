import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
      	float a1 = sc.nextFloat();
      	float a2 = sc.nextFloat();
      	float a3 = sc.nextFloat();
      	float a4 = sc.nextFloat();
      	float a5 = sc.nextFloat();
      	System.out.format("%.2f",(a1+a2+a3+a4+a5)/5);
    }
}