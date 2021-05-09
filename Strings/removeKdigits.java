import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class removeKdigits {
    public static void main(String s[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.next();
        System.out.println("Enter the limit");
        int k=sc.nextInt();
        removeK(a,k);
        sc.close();
    }
    public static void removeK(String s, int k)
    {
         
        int n=Integer.parseInt(s);
        int c[]=new int[s.length()];
        int i=0;
        ArrayDeque<Integer> l=new ArrayDeque<Integer>();
        while(n>0)
        {
            int a=n%10;
            n=n/10;
            c[i]=a;
            i++;
        
        }
        Arrays.sort(c);

        for(int j=0  ; j<c.length ; j++)
        {
            l.push(c[j]);
        }
  
        i=0;
        while(i<k)
        {
         l.pop();
            i++;
        }
     
        i=0;
        while(l.isEmpty()!=true)
        {
            i=i*10+l.pop();
        }
    int r=0;
    while(i>0)
    {
        int x=i%10;
        i=i/10;
        r=r*10+x;
    }
       System.out.println(Integer.toString(r));
    }
}
