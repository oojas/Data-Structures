import java.util.ArrayList;
import java.util.Scanner;
public class primeSumDP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(findPrimeSum(p,k));
        sc.close();
    }
    static String findPrimeSum(int p,int k)
    {
         if(p==0 || p==1)return "No";
         if(p==2)return "Yes";
         ArrayList<Integer> l=new ArrayList<>();
         for(int i=3 ; i<p ; i++)
         {
            int flag=1;
            for(int j=2 ; j<=i/2; j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            l.add(i);
         }
         int n=l.size();
        int count=findSum(l,p,n,k);
        if(count==0)return "No";
        return "Yes";
    }
    static int findSum(ArrayList<Integer>l,int p,int n,int k)
    {   
        if(p==0 && k==0)return 1;
        if(p<0)return 0;
        if(n==0)return 0;
        int res=findSum(l, p, n-1,k)+findSum(l,p-l.get(n-1),n-1,k-1);
        return res;
    }
}
