import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int c=0;
      	for(int i = 1 ; i <= n ; i++){
             for(int j = 1 ; j <= i ; j++){  
            	++c;
            	System.out.print((c%2==0)? "1 " : "0 ");
        	}
        System.out.println(" ");
    	}  
	}
}