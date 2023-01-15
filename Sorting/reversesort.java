import java.util.Scanner;

public class reversesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        reverseSort(a,n);
        System.out.println("The array after sorting");
        for(int c:a)
        {
            System.out.print(c+" ");
        }
    }
    static void reverseSort(int a[],int n)
    {
        int j=0;
         for(int i=0 ; i<n-1 ; i++)
         {
            int min=i;
            int minE=a[i];
            for(j=i ; j<n ; j++)
         {
              if(minE>a[j])
              {
                minE=a[j];
                min=j;
              }
         }
         reverse(a,i,min);
         }
    }
    static void reverse(int a[],int i,int j)
    {
       int s=i,e=j;
       while(s<e)
       {
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        s++;
        e--;
       }
    }
}
