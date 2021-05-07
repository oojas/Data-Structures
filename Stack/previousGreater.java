
import java.util.ArrayDeque;
import java.util.Scanner;

public class previousGreater {
     public static void main(String s[])
     {
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
         printGreater(a);
     }    
     public static void printGreater(int a[])
    {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        System.out.print(-1+" ");
        s.push(0);
        for(int i=1 ; i<a.length ; i++)
        {
            while(s.isEmpty()==false && a[s.peek()]<=a[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                System.out.print(-1+" ");
            }
            else
            System.out.print(a[s.peek()]+" ");
            s.push(i);
        }
    }
}
