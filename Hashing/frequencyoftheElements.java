import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyoftheElements {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
       System.out.println("Enter the elements of the array");
       int a[]=new int[n];
       for(int i=0 ; i<n ; i++){
           a[i]=sc.nextInt();
       }
       countDistinct(a,n);
    sc.close();
    }
    public static void countDistinct(int a[],int n)
    {

        LinkedHashMap<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
       for(int x:a)
       {
           m.put(x, m.getOrDefault(x, 0)+1);
       }
       for(Map.Entry<Integer,Integer> s:m.entrySet())
       {
           System.out.println(s.getKey()+" "+ s.getValue());
       }

    }
}
