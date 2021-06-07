import java.util.HashMap;
import java.util.Scanner;

public class longestwith0and1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int a[]=new int[n];
          for(int i=0 ; i<n ; i++)
          {
              a[i]=sc.nextInt();
          }
          sc.close();
          int val=calculateLongestsub(a);
               System.out.println(val);
    }
    public static int calculateLongestsub(int a[])
    {
        for(int i=0 ; i<a.length ; i++)
        {
            if(a[i]==0)
            {
                a[i]=-1;
            }
        }
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        int pre_sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0 ; i<a.length ; i++)
        {
            pre_sum+=a[i];
            if(m.containsKey(pre_sum)==false)
            {
                m.put(pre_sum,i);
            }
            if(m.containsKey(pre_sum-0))
            {
                res=Integer.max(res,i-m.get(pre_sum-0));
            }
        }
        return res;


    }
}
