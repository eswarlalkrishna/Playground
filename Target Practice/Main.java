import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int turns = 0, score = 0;
      	int tgt = sc.nextInt();
      	while(score < tgt){
        	int n = sc.nextInt();
          	score += n;
          	turns++;
        }
      	System.out.print("The number of turns is " + turns);
    }
}