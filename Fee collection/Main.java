import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
      	float t = sc.nextFloat();
      	float b = sc.nextFloat();
      	float h = sc.nextFloat();
      	if(s.equals("MSDS")) System.out.format("%.2f",t+b);
      	else if(s.equals("MSH")) System.out.format("%.2f",t+h);
      	else if(s.equals("MGSDS")) System.out.format("%.2f",1.5*t+b);
      	else if(s.equals("MGSH")) System.out.format("%.2f",1.5*t+h);
      	else System.out.println("Invalid");
    }
}