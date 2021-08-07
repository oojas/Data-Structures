import java.util.Scanner;
public class removeDup {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
  
        System.out.println("Enter the value of the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int val=remDups(a,n);
        for(int i=0 ; i<val ; i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    public static int dupFinder(int a[],int n)
    {
        int temp[]=new int[n];
        int res=1;
        temp[0]=a[0];
        for(int i=1 ; i<n ; i++)
        {
            if(temp[res-1]!=a[i])
            {
                temp[res]=a[i];
                res++;
            }
        }
        for(int i=0 ; i<n ; i++)
        {
            a[i]=temp[i];
        }
        return res;
    }
    static int remDups(int a[], int n)
    {
    	int res = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(a[res - 1] != a[i])
    		{
    			a[res] = a[i];
    			res++;
    		}
    	}

    	return res;
    }
}
