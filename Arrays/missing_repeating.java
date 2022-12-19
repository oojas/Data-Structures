import java.util.Scanner;

public class missing_repeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int res[]=findElements(a,n);
        for(int i=0 ; i<res.length ; i++)
        {
         System.out.print(res[i]+" ");
        } 
    }
    public static int [] findElements(int a[],int n)
    {
        int i=0;
        while(i<n)
        {
            if(a[i]!=a[a[i]-1])
            {
                int temp=a[i];
                a[i]=a[a[i]-1];
                a[a[i]-1]=temp;
            }
            else i++;
        }
        int res[]=new int[2];
        for(int j=0 ; j<n ; j++)
        {
         if(a[i]!=i+1)
         {
            res[0]=a[i];
            res[1]=i+1;
            break;
         }
        }
        return res;
    }
}
