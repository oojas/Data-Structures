

import java.util.Scanner;

public class palindrome {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
    String a=sc.nextLine();
    boolean val=stringChecker(a);
    if(val==true)
    {
        System.out.println("YES");

    }
    else
    {
        System.out.println("NO");
    }
    sc.close();
    }
  static  boolean  stringChecker(String b)
    {
      StringBuilder rev=new StringBuilder(b);
      rev.reverse();
    //  System.out.println(rev);
      if(b.equals(rev.toString()))
      {
          return true;
      }        
      return false;
    }
    public static boolean palindromeCheck(String c)
    {
        int beg=0;
        int end=c.length()-1;
        while(beg<end)
        {
            if(c.charAt(beg)!=c.charAt(end))
            {
               return false;
            }
            beg++;
            end--;
        }
        return true;
    }
}
