import java.util.Scanner;

public class optimalStratergy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(findOptimal(a,0,n-1));
    }
    static int findOptimal(int a[],int i,int j)
    {
        if(i+1==j)return Math.max(a[i],a[j]);
        return Math.max(a[i]+Math.min(findOptimal(a,i+2,j),findOptimal(a, i+1, j-1)),a[j]+Math.min(findOptimal(a, i, j-2),
        findOptimal(a, i+1, j-1)));
    }
}
