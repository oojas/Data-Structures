import java.util.Scanner;

public class waterstorage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int res=findStorage(a,n);
        System.out.print(res);
    }
    static int findStorage(int a[],int n){
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        int res=0;
      lmax[0]=a[0];
      rmax[n-1]=a[n-1];
      for(int i=1 ; i<n ; i++)
      {
        lmax[i]=Integer.max(lmax[i-1], a[i]);
        
      }
      for(int i=n-2 ; i>=0 ; i--){
        rmax[i]=Integer.max(rmax[i+1], a[i]);
      }
      for(int i=0 ; i<n ; i++)
      {
        res+=Integer.min(lmax[i], rmax[i])-a[i];
      }
      return res;
    }
}
