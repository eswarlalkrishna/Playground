import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int c1 = 0, c2 = 1;
       int c3 = c1 + c2;
       while(n!=3)
       {
           c1 = c2;
           c2 = c3;
           c3 = c1 + c2;
           n--;
       }
       System.out.println(c3);
    }
}