import java.util.Scanner;
import java.util.Arrays;
public class fibnoccai {
   
   static int m[];
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int  n=sc.nextInt();
     m=new int[n+1];
     Arrays.fill(m,-1);
     sc.close();      
     System.out.println(fib(n));
    }
     static int fib(int n) // memoization DP
     {
      if(m[n]==-1)
      {
        int res;
        if(n==0 || n==1)
        {
          res=n;
        }
        else res=fib(n-1)+fib(n-2);
        m[n]=res;
      }
      return m[n];

     }
    // static void fib(int n)
    // {
    //     int a=0,b=1;
    //     for(int i=0 ; i<n ; i++)
    //     {
    //         System.out.print(a+" ");
    //         int c=a+b;
    //         a=b;
    //         b=c;
    //     }
    // }
}
