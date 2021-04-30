

import java.util.Scanner;

public class generateSubsets {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.next();
        sc.close();
        String curr="";
        subsets(a,0,curr);

    }
    public static void subsets(String a,int index,String curr)
    {
        if(index==a.length())
        {
             System.out.print(curr+" ");
             return;
        }
        subsets(a, index+1, curr);
        subsets(a, index+1, curr+a.charAt(index));
    }
}
