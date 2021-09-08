import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int i = 1;
      	//int m = n;
      	int j = 6;
      	System.out.print(j + " ");
      	while(i<n){
          	if(i<n-1) {
            	j = j + i * 5;
              	System.out.print(j + " ");
            }
          	else{
              	j = j + i * 5;
              	System.out.print(j);
            }
          	i++;
        }
	}
}