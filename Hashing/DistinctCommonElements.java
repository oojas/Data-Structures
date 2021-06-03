import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class DistinctCommonElements {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n=sc.nextInt();
        System.out.println("Enter the size of the second array");
        int m=sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        int b[]=new int[m];
        for(int i=0 ; i<m ; i++)
        {
           b[i]=sc.nextInt();
        }
        sc.close();
        int val=countDistinctIntersection(a,b);
        System.out.println(val);
        int v=countDistinctIntersectionEfficient(a, b);
        System.out.println(v);
    }
    public static int countDistinctIntersection(int a[],int b[])
    {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int x: a)
        {
            m.put(x,1);
        }
        for(int y: b)
        {
            m.put(y,m.getOrDefault(y,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> x :m.entrySet())
        {
            if(x.getValue()>1)
            {
                count++;
            }
        }
        return count;
    }
    public static int countDistinctIntersectionEfficient(int a[],int b[])
    {
        HashSet<Integer> h=new HashSet<>();
        for(int x: a)
        {
            h.add(x);
        } 
        int count=0;
        for(int x:b)
        {
            if(h.contains(x))
            {
                 count++;
                 h.remove(x);
            }
        }
        return count;
    }
}
