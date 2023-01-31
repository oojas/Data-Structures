import java.util.Scanner;

public class lis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n;  i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(findLisDp(a,n));
    }
    static int findLisDp(int a[],int n)
    {
       int res[]=new int[n];
       res[0]=1;
       for(int i=1 ; i<n ; i++)
       {
        res[i]=1;
        for(int j=0 ; j<i; j++)
        {
            if(a[j]<a[i])
            {
                res[i]=Integer.max(res[i],res[j]+1);
            }
        }
    }
        int ans=res[0];
        for(int i=0 ; i<n ; i++)
        {
            ans=Math.max(ans,res[i]);
        }
        return ans;
       }
    }

