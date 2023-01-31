import java.util.Scanner;
public class knapsack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
         v[i]=sc.nextInt();
        }
        int w[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            w[i]=sc.nextInt();
        }
        int tw=sc.nextInt();
      sc.close();
      int val=findKnap(v,w,tw,n);
      System.out.println(val);
    }
    static int findKnap(int v[],int w[],int tw,int n)
    {
        if(n==0 || tw==0)return 0;
        if(w[n-1]>tw)return findKnap(v, w, tw, n-1);
        return Math.max(findKnap(v,w,tw,n-1),v[n-1]+findKnap(v, w, tw-w[n-1], n-1));
    }
}
