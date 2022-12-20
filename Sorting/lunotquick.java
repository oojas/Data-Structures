import java.util.Scanner;

public class lunotquick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();

        }
        sort(a,0,a.length-1);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    static void sort(int a[],int l, int h)
    {
       if(l<h)
       {
         int p=partition(a,l,h);
         sort(a, l, p-1);
         sort(a,p+1,h);
       }
    }
    static int partition(int a[],int l,int h)
    {
        int pivot=a[h];
        int i=l-1;
        for(int j=l ; j<h ; j++)
        {
           if(a[j]<pivot)
           {
            i++;
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
           }
        }
        int temp=a[i+1];
        a[i+1]=a[h];
        a[h]=temp;
        return i+1;
    }
}
