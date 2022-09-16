import java.util.Arrays;
import java.util.Scanner;
public class rearrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        arrange(a,n);
    }
    static void arrange(int a[],int n){
     int m=a[n-1]+1;
     int i=0,j=n-1;
     for(int k=0 ; i<n ; i++)
     {
        if(k%2==0){
            a[k]=a[k]+((a[j]%m)*m);
            j--;
        }
        else{
            a[k]=a[k]+((a[i]%m)*m);
            i++;
        }
     }
     i=0;
     for(i=0 ; i<n ; i++)
     {
        a[i]=a[i]/m;
        System.out.print(a[i]+" ");
     }
     
    }
}
