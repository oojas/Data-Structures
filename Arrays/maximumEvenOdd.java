import java.util.Scanner;

public class maximumEvenOdd {
  public static void main(String s[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      System.out.println("Enter the elements of the array");
      int a[]=new int[n];
      for(int i=0 ; i<n ; i++)
      {
          a[i]=sc.nextInt();
      }
      sc.close();
      int val=maxLength(a,n);
      System.out.println(val);
  }  
  public static int maxLength(int a[],int n)
  {
      int j=0;
      int res=1;
      boolean val=true;
      if(a[0]%2==0)
      val=true;
      else
      val=false;
      for(int i=1 ; i<n ; i++)
      {
          boolean temp=val;
          val=check(a[i]);
          if(val!=temp)
          {
              res=Integer.max(res, i-j+1);
          }
          else
          {
              j++;
          }
      }
      return res;
  }
  public static boolean check(int n)
  {
      if(n%2==0)return true;
      else
      return false;
  }
}
