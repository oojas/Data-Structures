

import java.util.Scanner;

public class subsequence {
    public static void main(String s[]) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String a=sc.next();
    System.out.println("Enter the string to be checked");
    String b=sc.next();
    boolean val=check(a,b);
    sc.close();
    if(val==true)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
}  
public static boolean check(String a, String b)
{  
    int val=0;
    for(Character c: b.toCharArray())
    {
         val=0;
        val=a.indexOf(c);
        if(val==-1)
        {return false;}
    }
    int i=0;
    int j=0;
    while(j!=b.length()-1)
    {
        if(a.indexOf(b.charAt(i))>a.indexOf(b.charAt(i+1)))
        return false;
        i++;
        j++;
    }
    return true;
}
}
