import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class maps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
       findFreq(a);
    }
    static void findFreq(int a[])
    {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int x:a)
        {
            m.put(x, m.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer, Integer> k:m.entrySet()){
           System.out.println(k.getKey()+" "+k.getValue());
        }
    }
}
