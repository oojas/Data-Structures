package Strings;

import java.util.Scanner;

public class reverseString {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        sc.close();
        reverse(a);
        
    }
    public static void reverse(String a)
    {
        int i=a.length()-1;
        String ans=""; 
           // My name is Ojas 
        while(i>=0)
        {
            while(i>=0 && a.charAt(i)==' ')
            i--;
            int j=i;
            if(i<0)break;
            
            while(i>=0 && a.charAt(i)!=' ')
            i--;
            
            if(ans.isEmpty())
            {
               ans=ans.concat(a.substring(i+1,j+1));
            }
            else
           { ans=ans.concat(" "+a.substring(i+1,j+1));}
           
        }
        System.out.print(ans);
    }
}
