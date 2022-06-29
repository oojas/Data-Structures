import java.util.HashMap;
import java.util.Scanner;

public class longest {
 
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    
    for(int i=0 ; i<n ; i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println();
    for(int i=0 ; i<n ; i++)
    {
        b[i]=sc.nextInt();
    }
    int temp[]=new int[n];
    for(int i=0 ; i<n ; i++)
    {
        temp[i]=a[i]-b[i];
    }
    for(int i=0 ; i<n ; i++)
    {
        System.out.print(temp[i]+" ");
    }
    System.out.println();
    sc.close();
    int res=findLong(temp,n);
    System.out.println(res);
 }
 static int findLong(int a[],int n){
    HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
    int sum=0;
    int res=0;
    for(int i=0 ; i<n ; i++)
    {
        sum+=a[i];
        if(sum==0)
        {
            res=i+1;
        }
        if(h.containsKey(sum))
        {
            res=Integer.max(res,i-h.get(sum) );
        }
        h.put(sum, i);

    }
    return res;
 }
}
