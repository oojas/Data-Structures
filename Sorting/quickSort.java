import java.util.Scanner;

public class quickSort {
    public static void main(String [] argsd)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
       int n=sc.nextInt();
       int a[]=new int[n];
      System.out.println("Enter the elements in the array");
      for(int i=0 ; i<n ; i++)
      {
          n=sc.nextInt();
      }
       sc.close();

      QuickSort(a,0,n-1);
      
    }
    public static void QuickSort(int a[],int l,int h)
    {
       if(l<h)
       {
           int pivot=partition(a,l,h);
           QuickSort(a,l,pivot-1);
           QuickSort(a,pivot+1,h);
       }
    }
    public static void print(int a[])
    {
        System.out.println("The sorted array");
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static int partition(int a[],int l,int h)
    {
          int pivot=a[l];
          int i=l;
          int j=h;
          while(i<j)
          {
              while(pivot>=a[i])i++;
              while(a[j]>pivot)j--;
              if(i<j)
              {
                  swap(a,i,j);
              }

          }
          swap(a,l,j);
          return j;
    }
    public static void swap(int a[],int l,int h)
    {
        int temp=a[l];
        a[l]=a[h];
        a[h]=temp;
    }

}
