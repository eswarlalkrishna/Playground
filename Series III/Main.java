import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int i = 1;
      	int j = 3;
      	while(i<=n){
			double k = Math.pow(j , i);
          	if(i<n) System.out.print((int)k + " ");
          	else System.out.print((int)k);
          	i++;
        }
	}
}