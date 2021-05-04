

import java.util.Scanner;

public class leftmostRepeating {
   public static void main(String sp[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String a=sc.next();
     sc.close();
     check(a);
   }
   // General approach if you don't know the lastIndexOf function
   public static void Checker(String a)
   {
     int Char=256;
     int res=-1;
     boolean visited[]=new boolean[Char];
     for(int i=0 ; i<a.length() ; i++)
     {
         if(visited[a.charAt(i)])
         res=i;
         else
         visited[a.charAt(i)]=true;
     }
     System.out.println(res);

   }
   // Better approach but knowing the functions are a must
   public static void check(String a)
   {
    int c=-1;
    for(int i=0 ; i<a.length() ; i++)
    {
        int val=a.lastIndexOf(a.charAt(i));
        if(val>i)
        {System.out.println(i);
           c=0;
        break;}
    }
    if(c==-1)
    {
        System.out.println(c);
    }
  
   }
}
