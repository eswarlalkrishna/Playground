import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    		Scanner sc = new Scanner(System.in);
      		int m = sc.nextInt();
      		if(m>100) System.out.print("Invalid Input");
            else if(m==100) System.out.print("S");
      		else if(m>=90) System.out.print("A");
            else if(m>=80) System.out.print("B");
            else if(m>=70) System.out.print("C");
            else if(m>=60) System.out.print("D");
            else if(m>=50) System.out.print("E");
            else System.out.print("F");
    }
}