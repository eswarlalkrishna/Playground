import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int m = sc.nextInt();
      	int n = sc.nextInt();
      	int i = 1;
      	while(i<=n){
        System.out.println(i+"*"+m+"="+i*m);
        i++;
        }
    }
}