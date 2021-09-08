import java.util.*;
import java.lang.String;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
      	//int i = a.length();
      	System.out.print(a.replaceAll("the ",""));
	}
}