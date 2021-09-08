import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	StringBuilder s1 = new StringBuilder();
      	s1.append(s);
      	s1.reverse();
      	System.out.print(s1);
	}
}