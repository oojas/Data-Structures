import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class stackspan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        findSpan(a,n);
    }
    public static void findSpan(int a[],int n)
    {
        Deque<Integer> m=new ArrayDeque<Integer>();
        m.push(0);
        System.out.print(1+" ");
        for(int i=1 ; i<n ; i++)
        {
            while(m.isEmpty()==false && a[m.peek()]<=a[i])m.pop();
            if(m.isEmpty())System.out.print(i+1+" ");
            else{
                int val=i-m.peek();
                System.out.print(val+" ");
            }
            m.push(i);
        }
    }
}
