package Strings;

import java.util.Scanner;

public class patternSearch {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.next();
        System.out.println("Enter the substring to be checked");
        String b=sc.next();
        sc.close();
        naiveSimple(a,b);
    }
    // Naive method for pattern searching as it gives you the time complexity of o(m*n).
    public static void patternsearch(String a, String b )
    {
         int count=0;
         int res=-1;
         int val=0;
         for(int i=0 ; i<a.length(); i++)
         {
             int temp=i;
             if((a.length()-i)<b.length())break;   
             for(Character c: b.toCharArray())  //ABCABCDABCD
                                                // ABCD
             {
                
                 if(c==a.charAt(i))
                 {
                     res=temp;
                     count++;
                     i++;
                 }
                 else
                 {
                    res=-1;
                    count=0;
                    i=temp;
                    break;
                 }
                
             }
             
             if(count==b.length()){
                 System.out.print(res+" ");
                 val++;
             }
             res=-1;
             count=0;
             i=temp;
             if(i>=a.length())break;
         
             
         }
         if(val==0)
         System.out.println("The entered pattern is not present in the string");
    }
    public static void naiveSimple(String a,String b)
    {
     int n=a.length();
     int m=b.length();
     int val=0;
     for(int i=0 ; i<=(n-m) ; i++)
     {
         int j;
         for(j=0 ; j<b.length() ; j++)
         {
             if(b.charAt(j)!=a.charAt(i+j))
             break;
             
         }
         if(j==m){
            System.out.print(i+" ");
            val++;
        }
     }
     if(val==0)
     {
         System.out.println("No String found");
     }
    }

}
