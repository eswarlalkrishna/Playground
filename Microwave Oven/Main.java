import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
   		Scanner sc=new Scanner(System.in);
   		int a=sc.nextInt();
   		float f=sc.nextFloat();
   		switch(a)
   		{
        	case 1:
                 System.out.println(f);
                 break;
        	case 2:
                 double t=(1.5)*f;
                 System.out.println(t);
                 break;
 			case 3:
                 t=2*f;
                 System.out.println(t);
                 break;
        	default:
              	System.out.println("Number of items is more");
              	break;
   		}
	}
}