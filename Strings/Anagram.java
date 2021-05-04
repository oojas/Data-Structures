

import java.util.Scanner;

public class Anagram {
     public static void main(String s[]) 
     {
         Scanner sc=new Scanner(System.in);
           System.out.println("Enter the string");
           String a=sc.next();
           System.out.println("Enter the string to be checked");
           String b=sc.next();
           boolean val=check(a,b); 
           sc.close(); 
           if(val)
           {
               System.out.println("Yes, It is an anagram");

           }
           else
           {
               System.out.println("No, it is not an anagram");
           }
     } 
     // Better approach because its time complexity is O(n)
     static final int Char=256; 
     public static boolean Checker(String a, String b)
     {
         if(a.length()!=b.length())
         return false;
       
         int n[]=new int[Char];
         for(int i=0 ; i<a.length() ; i++)
         {
             n[a.charAt(i)]++;
             n[b.charAt(i)]--;
         }
         for(int i=0 ;  i<256 ; i++)
         {
             if(n[i]!=0)
             return false;
         }
         return true;
     } 
      // Not so good approach because the time complexity is O(n2)
     public static boolean check(String a, String b)
     {
         if(a.length()!=b.length())
         return false;
       int count=1;
       int c[]=new int[a.length()];
       for(int i=0 ; i<a.length() ; i++)
       {
           count=1;
           for(int j=i+1 ; j<a.length() ; j++)
           {
               if(a.charAt(i)==a.charAt(j))
               {
                   count++;
               }
           }
         c[i]=count;
       }

       for(int i=0 ; i<b.length()  ; i++)
       {
           int pos=1;
           if(a.indexOf(b.charAt(i))==-1)
           {
               return false;
           }
           for(int j=i+1 ; j<b.length(); j++)
           {
               if(b.charAt(i)==b.charAt(j))
               {
                   pos++;
               }
           }
           int v=a.indexOf(b.charAt(i));
           if(c[v]!=pos)
           {
               return false;
           }
       }

       return true;
     }
}
