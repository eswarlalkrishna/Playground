import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int c=(int)(Math.sqrt(((x1-x2)*(x1-x2))+(y1-y2)*(y1-y2)));
		if(c==r1+r2)
    		System.out.println("Tangential");
		else if(c>r1+r2)
    		System.out.println("Do not overlap");
		else
    		System.out.println("Overlap");
	}
}