import java.util.*;
public class countDistinct {
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
        int vl=countDistinctElements(a,n);
        System.out.println(vl);
    }
    public static int countDistinctElements(int a[],int n)
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0 ; i<n ; i++)
        {
            h.add(a[i]);
        }
        return h.size();
    }
}
