import java.util.*;
public class countDistinctElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int vl=countDistinct(a,n);
        System.out.println(vl);
    }
    public static int countDistinct(int a[],int n)
    {
        Arrays.sort(a);
     int len=a.length;
     for(int i=0 ; i<n-1 ; i++)
     {
         if(a[i]==a[i+1])len--;
     }
     return len;
    }
}
