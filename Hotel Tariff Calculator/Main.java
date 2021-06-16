import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	float r = sc.nextFloat();
      	int d = sc.nextInt();
      	if(n<1 || n>12) { System.out.print("Invalid Input"); System.exit(0); }
      	switch(n){
        case 4:
      		System.out.format("%.2f",1.2*r*d);
      		break;
      	  case 5:
      		System.out.format("%.2f",1.2*r*d);
      		break;
      	  case 6:
      		System.out.format("%.2f",1.2*r*d);
      		break;
          case 11:
      		System.out.format("%.2f",1.2*r*d);
      		break;
      	  case 12:
      		System.out.format("%.2f",1.2*r*d);
      		break;
      		default:
            System.out.format("%.2f",r*d);
        }   
	}
}