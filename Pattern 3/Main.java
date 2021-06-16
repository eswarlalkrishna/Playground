import java.util.Scanner;
class Main
{
	public static void main(String args[])
    {  
	 	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	   	for(int i = 1 ; i <= n * 2 ; i = i + 2){
        	for(int j = i ; j <= n * 2 ; j = j + 2) System.out.print(j+" ");
	    System.out.println(" ");    
	    }
	}
}