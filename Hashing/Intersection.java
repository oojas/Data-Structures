import java.util.HashSet;
import java.util.Scanner;
public class Intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[x];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0 ; i<x ; i++)
        {
            b[i]=sc.nextInt();
        }
        
        sc.close();
        int val=FindIntersection(a,b);
        System.out.print(val);
    }
    static int FindIntersection(int a[],int b[]){
        HashSet<Integer> m=new HashSet<Integer>();
      for(int x:a)
      {
        m.add(x);
      }
      int count=0;
      for(int y:b)
      {
        if(m.contains(y))
        {count++;
            m.remove(y);}
      }
      return count;
    }
}
