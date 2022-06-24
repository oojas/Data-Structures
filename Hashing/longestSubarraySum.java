import java.util.HashMap;
import java.util.Scanner;
public class longestSubarraySum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];

    for(int i=0 ; i<n ; i++)
    {
        a[i]=sc.nextInt();
    }
    int sum=sc.nextInt();
    sc.close();
    int  val=Find(a,n,sum);
    System.out.print(val);
   }
   static int Find(int a[],int n,int sum){
    HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
    int res=0;
    int presum=0;
    for(int i=0 ; i<n ; i++){
        presum+=a[i];
        if(presum==sum)
        {
            res=i+1;
        }
        if(m.containsKey(presum-sum))
        {
            res=Integer.max(res, i-m.get(presum-sum));
        }
        m.put(presum, i);
    }
    return res;
   }
}
