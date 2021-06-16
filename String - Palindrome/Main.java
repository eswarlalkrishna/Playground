import java.util.Scanner;
class Main{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
      	String s = sc.nextLine();
		int i = 0, j = s.length() - 1, d = 0;
  		while (i < j) {
			if(s.charAt(i) == s.charAt(j)) d = 1; else d = -1;
			i++;
			j--;
		}
			System.out.print(( d > 0 )? "Palindrome" :"Not a Palindrome");
	}
}