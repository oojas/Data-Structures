package Strings;
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
       int count=1;
       int k=0;
    int n[]=new int[a.length()];
    boolean visited[]=new boolean[256];
    for(int i=0 ; i<a.length() ; i++)
    {
        for(int j=i+1 ; j<a.length() ; j++)   //abaacdbab
        {
          if(a.charAt(i)!=a.charAt(j)&& visited[a.charAt(j)]==false)
          {
              count++;
              visited[a.charAt(j)]=true;
          }
          else
          {
              n[k]=count;
              k++;
              visited[a.charAt(i)]=false;
              count=1;
              break;
          }
          
        }
    }
    int large=n[0];
    for(int i=1 ; i<n.length ; i++)
    {
        if(large<n[i])
        {
            large=n[i];
        }
    }
    return large;
   }
}
