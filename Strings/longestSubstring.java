
import java.util.Scanner;

public class longestSubstring {
   public static void main(String s[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string");
       String a=sc.next();
       sc.close();
      int val= printLong(a);
      System.out.println(val);
   } 
   public static int printLong(String a)
   {
       int res=0;
     for(int i=0 ; i<a.length() ; i++)
     {
         boolean visited[]=new boolean[256];
         for(int j=i ; j<a.length() ; j++)
         {
             if( visited[a.charAt(j)]==true)
             {
                break;
             }
             else
             {
                res=Integer.max(res, j-i+1);
                visited[a.charAt(j)]=true;
             }
         }
     }
     return res;
   }
}
