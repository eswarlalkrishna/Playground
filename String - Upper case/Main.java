import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
 		String s = sc.nextLine();
		char str[] = s.toCharArray();
     	int i = 0;
      	while( i < str.length ){
         	if(str[i]>='A' && str[i]<='Z') str[i]=(char)((int)str[i]+32);
          	else if(str[i]>='a' && str[i]<='z') str[i]=(char)((int)str[i]-32);
			i++;
     }
     for( i=0; i < str.length ; i++) System.out.print(str[i]);
 	}
}