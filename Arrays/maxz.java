import java.util.Scanner;
public class maxz {
    public static void main(String []args)

    { 
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0 ; i<n ; i++)
          {
              a[i]=sc.nextInt();
          }
          sc.close();
          int val=findMax(a,n);
          System.out.println(val);
    } 
    public static int findMax(int a[],int n)
    {
      int res=0;
      int val=0;
      for(int i=0 ; i<n ; i++)
      {
          if(a[i]==1)val++;
          else val=0;
          res=Integer.max(res, val);
      }
      return res;
    }
}
