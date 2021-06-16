import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                if(arr[i]==arr[j] && (i>j))
                    f=1;  
            }
            if(f==0)
                c++;
        }
        System.out.printf("%d",c);
    }
}