import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
      	int c=sc.nextInt();
      	int d=sc.nextInt();
      if(d<a && d<b && d<c)
        {
            if(a<b && a<c)
            System.out.println("L1");
            else if(b<c)
            System.out.println("L2");
            else
            System.out.println("L3");
        }
        else if(d<a && d<b)
        {
            if(a<b)
            System.out.println("L1");
            else
            System.out.println("L2");
        }
        else if(d<a && d<c)
        {
            if(a<c)
            System.out.println("L1");
            else
            System.out.println("L3");
        }
        else if(d<b && d<c)
        {
            if(b<c)
            System.out.println("L2");
            else
            System.out.println("L3");
        }
        else if(d<a)
        System.out.println("L1");
        else if(d<b)
        System.out.println("L2");
        else if(d<c)
        System.out.println("L3");
        else
        System.out.println("0");
    }
}