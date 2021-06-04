import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
    for(int i=0 ; i<n  ; i++)
    {
        a[i]=sc.nextInt();
    }
    findMajority(a);
       sc.close();
    }

    public static void findMajority(int a[])
    {
       HashMap<Integer,Integer> m=new HashMap<>();
       for(int i=0 ; i<a.length ; i++)
       {
           m.put(a[i],m.getOrDefault(a[i],0)+1);
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
       System.out.println(keyMax);
    }
}
