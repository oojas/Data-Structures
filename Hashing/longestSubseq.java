import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class longestSubseq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int res=findSeq(a,n);
        System.out.println(res);
    }
    static int findSeq(int a[],int n)
    {
     Arrays.sort(a);
     int res=0,count=1;
     for(int i=0 ; i<n-1 ; i++)
     {
        if(a[i+1]-a[i]==1)
        {
            count++;
            res=Integer.max(res, count);
        }
        else count=1;
     }
     return res;
    }
    static int findSeqEfficient(int a[],int n)
    {
        HashSet<Integer> h=new HashSet<>();
        for(Integer x:a)
        {
            h.add(x);
        }
        int res=1;
        for(Integer x:h)
        {
            if(h.contains(x-1)==false)
            {
                int curr=1;
                while(h.contains(x+curr))curr++;
                res=Integer.max(res, curr);
            }
        }
        return res;
    }
}
