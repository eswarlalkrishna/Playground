import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[][] = new int[n][n];
      	for(int i = 0; i < n; i++){
        	for(int j = 0; j < n; j++){
            	a[i][j] = sc.nextInt();
         		}
		}
      	int c = 0, d = 0;
      	for(int i = 0; i < n; i++){
        	for(int j = 0; j < n; j++){
              	if(i != j && a[i][j] != 0){
                  c = 1;
                  break;
                }
              	if(i == j && a[i][j] == 0) d++;
                }
         }
      	if(c == 0 && d < n) System.out.print("yes");
      	else System.out.print("no");
	}
}