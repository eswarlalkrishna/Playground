import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
class Main
{
    private static DecimalFormat df = new DecimalFormat("0.00");
  	public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int l = sc.nextInt();
      	int b = sc.nextInt();
      	double  r = sc.nextDouble();
      	System.out.println(a*a);
      	System.out.println(l*b);
      	df.setRoundingMode(RoundingMode.DOWN);
      	System.out.format(df.format(3.14 * r * r));
    }
}