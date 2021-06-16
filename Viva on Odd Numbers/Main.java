import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int c = 0;
      	float s = 0;
      	while(c!=3){
      		int n = sc.nextInt();
        	if(n<0){
            	s-=1;
              	System.out.println(s);
              	System.exit(0);
            }
          	if(n%2 == 1) {
            	s+=1;
              	c++;
            }
          	else if(n%2 == 0) s-=0.5;
        }
      	System.out.println(s);
    }
}