import java.util.ArrayList;
import java.util.Scanner;
public class longestsubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(findSubEff(a,n));
    }
    static int findSub(int a[],int n) // solution with dynamic programming. Time complexity is O(n^2)
    {
        int l[]=new int[n];
        l[0]=1;
        for(int i=1 ; i<n ; i++)
        {
            l[i]=1;
            for(int j=0 ; j<i ; j++)
            {
              if(a[j]<a[i])
              {
                l[i]=Integer.max(l[i],l[j]+1);
              }
            }
        }
        int res=l[0];
        for(int i=1 ; i<n ; i++)
        {
            res=Integer.max(res,l[i]);
        }
        return res;

    }
    static int findSubEff(int a[],int n)
    {
        int len=1;
        ArrayList<Integer> l=new ArrayList<>();
        l.add(len-1);
        for(int i=1 ; i<n ; i++)
        {
            if(l.get(len-1)>a[i])
            {
                int celInd=findCel(l,0,len-1,a[i]);
                l.set(celInd, a[i]);
            }
            else
            {
                l.add(a[i]);
                len++;
            }
        }
        return l.size();
    }
    static int findCel(ArrayList<Integer> l,int s,int e,int key)
    {
        while(s<e)
        {
            int mid=(s+e)/2;
            if(l.get(mid)>=key)
            {
                e=mid;
            }
            else
            s=mid+1;
        }
        return e;
    }
}
