import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class sortedSum {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        sortSum(a);
    }
    public static void sortSum(int a[])
    {
        int sum=0;
        int val=0;
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=a.length-1 ; i>=0 ; i--)
        {
            for(int j=0 ; j<=i ; j++)
            {
               l.add(a[j]);
               val=sort(l);
            }
            sum+=val;
            l.clear();
        }
        System.out.println(sum);  
      }
    public static int sort(ArrayList<Integer>l)
    {
        Collections.sort(l);
        int k=1;
        int sum=0;
        for(int i=0 ; i<l.size()-1 ; i++)
        {
            sum+=k*l.get(i);
            k++;
        }
        return sum;
    }
}
