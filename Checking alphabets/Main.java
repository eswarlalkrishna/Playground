import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
      	char ctr = sc.next().charAt(0);
      	if(ctr=='a' || ctr=='A' || ctr=='e' || ctr=='E'
          || ctr=='i' || ctr=='I' || ctr=='o' || ctr=='O'
          || ctr=='u' || ctr=='U') System.out.print("Vowel");
      	else if(ctr>='A' && ctr<='Z' || ctr>='a' && ctr<='z')System.out.print("Consonant");
    	else System.out.print("Not an alphabet");
    }
}