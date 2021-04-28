package Recursion;

import java.util.Scanner;

public class palindrome {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.next();
        sc.close();
        int start =0;
        int end=a.length()-1;
        boolean val=check(a,start,end);
        if(val==true)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
    public static boolean val=true;
    public static boolean check(String s,int start,int end)
    {
       if(start>end)return true;
       if(val==false)return false;
       if(s.charAt(start)==s.charAt(end))
       val=true;
       else
       val=false;
    
      val=check(s,start+1,end-1);
      return val;
    }
    
}
