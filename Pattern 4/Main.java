import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	  	for(int i = n ; i >= 1 ; i--){
	        for(int j = i ; j <= n ; j++) System.out.print( j +"");  
		    for(int k = 1 ; k <= i - 1 ; k++) System.out.print( n +"");
	    System.out.println("");
	    }
    }
}