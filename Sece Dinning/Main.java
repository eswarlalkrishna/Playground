import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	String h = sc.next();
      	int d = sc.nextInt();
      	if(h.equals("front") || h.equals("FRONT")) {
          if(d==1)
        System.out.print("Left Handed");
      	else System.out.print("Right Handed"); }
        else if(h.equals("rear") || h.equals("REAR")){
          if(d==1 || d==2)
          System.out.print("Right Handed");
      	else System.out.print("Left Handed"); }
	}
}