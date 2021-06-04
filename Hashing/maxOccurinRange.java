import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxOccurinRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter first array");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the second element");
        int b[]=new int[n];
        for(int j=0 ; j<n ; j++)
        {
            b[j]=sc.nextInt();
        }
        sc.close();
        int maxElement=findMax(a,b);
        System.out.println(maxElement);
    }
    public static int findMax(int a[],int b[])
    {
        int i=0;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        while(i<a.length)
        {
            int j=a[i];
            while(j<=b[i])
            {
                m.put(j,m.getOrDefault(j,0)+1);
                j++;
            }
            i++;
        }
        int keyMax=Integer.MIN_VALUE;
        int value=Integer.MIN_VALUE;
       for(Map.Entry<Integer,Integer> s:m.entrySet())
        {
         if(value<s.getValue())
         {
             value=s.getValue();
             keyMax=s.getKey();
         }
        }
        return keyMax;
    }
}
