import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
   		Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	int a[] = new int[n];
     	int i = 0;
     	double s = 0;
     	while( i < n ){
        	a[i] = sc.nextInt();
          	i++;
        }
     	i = 0 ;
     	while( i < n ){
        	s += a[i];
          	i++;
        }
     	System.out.printf("The mean of the array is " + String.format("%.2f",s/i));
  	 }
 }