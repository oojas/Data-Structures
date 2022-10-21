import java.util.Scanner;

public class mergesortarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0 ; i<m ;i++)
        {
            b[i]=sc.nextInt();
        }
        sc.close();
        mergearray(a,b,n,m);
    }
    static void mergearray(int a[],int b[],int n,int m)
    {
        int i=0;
        while(i<Integer.min(n, m))
    }
}
