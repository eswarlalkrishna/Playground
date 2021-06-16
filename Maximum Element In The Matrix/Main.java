import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] a = new int[n][n];
		int sum1=0,sum2=0;
		for( int i = 0 ; i < n ; i++ ){
		    for( int j = 0 ; j < n ; j++ ) a[i][j] = s.nextInt();
		}
      	int max = 0;
      	for( int i = 0 ; i < n ; i++ ){
		    for( int j = 0 ; j < n ; j++ ){
              	if(max < a[i][j]) max = a[i][j];
			}
        }
      	System.out.print(max);
	}
}