import java.util.Scanner;
class Main{
	public static void main(String[]args)
	{
		int i,a=0,b=0,c=1,d=0;
		i=3;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) System.out.print("0");
		else if(n==2) System.out.print("0 0");
		else if(n==3) System.out.print("0 0 1");
		else System.out.print("0 0 1 ");
		while(i!=n){
			d=a+b+c;
			System.out.print(d+" ");
			a=b;
			b=c;
			c=d;
			i++;
		}
	}
}