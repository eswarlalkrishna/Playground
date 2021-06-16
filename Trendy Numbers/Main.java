import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	if(n>99 && n<1000){
        	if(((n/100)/10) % 3 == 0)
              	System.out.println("Trendy Number");
          	else System.out.println("Not a Trendy Number");
        }
      	else System.out.println("Not a Trendy Number");
    }
}