import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	System.out.print((n % 9 == 0)? "Kaprekar Number":"Not a Kaprekar Number");
    }
}