import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int c = 0;
      	System.out.println(n);
      	if(n==1) {
          System.out.println("0");
          System.exit(0);
        }
      	while(n!=1){
        if(n % 2 == 0) n/=2;
        else n = 3 * n + 1;
        System.out.println(n);
        c++;
        }
      	System.out.println(c);
    }
}