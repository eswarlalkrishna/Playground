import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	//Scanner sc1 = new Scanner(System.in);
      	String d = sc.next();
      	switch(d){
        	case "L1":
          		if(b<c) System.out.println("L2");
          		else System.out.println("L3");
          		break;
          	case "L2":
          		if(a<c) System.out.println("L1");
          		else System.out.println("L3");
          		break;
          	case "L3":
          		if(a<b) System.out.println("L1");
          		else System.out.println("L2");
          		break;
        }
  	}
}