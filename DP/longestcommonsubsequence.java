import java.util.Arrays;
import java.util.Scanner;
public class longestcommonsubsequence {
    static int x[][];
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int n=s.length();
    int m=t.length();
    sc.close();
    x=new int[m+1][n+1];
    for(int [] row:x)
    {
        Arrays.fill(row,-1);
    }
    System.out.println(naiveFindPair(s, t, m, n));  
   }  
   static int findPair(String s, String t, int n,int m) // DP implementation with time complexity of o(mn)
   {
    if(x[m][n]!=-1)return x[m][n];
      if(n==0 || m==0)
      {
        x[m][n]=0;
      }
     else{
      if(s.charAt(n-1)==t.charAt(m-1))x[m][n]= 1+findPair(s,t,n-1,m-1);
      else{
        x[m][n]= Integer.max(findPair(s,t,n-1,m),findPair(s, t, n, m-1));
      }
    }
      return x[m][n];
   }



   static int naiveFindPair(String s, String t, int m,int n)  // Naive recursion implementation with time complexity of 2^n (Exponential)
   {
    if(n==0 || m==0)
{
    return 0;
}
    if(s.charAt(m-1)==t.charAt(n-1))
    {
        return 1+naiveFindPair(s,t,m-1,n-1);
    }
    else{
        return Integer.max(naiveFindPair(s,t,m,n-1),naiveFindPair(s, t, m-1, n));
    }
   }
}
