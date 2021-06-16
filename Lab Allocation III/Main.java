import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	int e=0;
      	if(d<=a) e++;
      	if(d<=b) e++;
      	if(d<=c) e++;
      	if(e>0) System.out.println(e);
      	else { e = 0; System.out.println(e); }
    }
}