import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int t = sc.nextInt();
            ArrayList<Integer> ls = new ArrayList<Integer>();
            Integer[] temp = new Integer[0];
            for (int i = 0; i < t; i++) {
                int num = sc.nextInt();
                if (!(ls.isEmpty())) {
                    if (num >=ls.get(ls.size()-1 )) {
                        ls.add(num);
                    } 
                    else {
                   
                        if(ls.size()>temp.length)
                            temp=ls.toArray(temp);
                        ls.clear();
                        ls.add(num);
                    }
                
                } 
                else {
                    ls.add(num);
                }
            }
            if(ls.size()>temp.length)
            {
                temp=ls.toArray(temp);
                ls.clear();
            }
            for (int i = 0; i < temp.length; i++) {
                if(i<temp.length-1)
                    System.out.print(temp[i]+" ");
                else
                    System.out.println(temp[i]);

            }
        }
        
    }
}