import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int p = sc.nextInt();
      	int n = sc.nextInt();
      	float r = sc.nextFloat();
      	System.out.format("%.2f",p*n*r/100);
    }
}