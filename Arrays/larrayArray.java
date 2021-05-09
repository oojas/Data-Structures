// import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class larrayArray {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        Integer.toString(23);
        // ArrayDeque<Integer> l=new ArrayDeque<>();
        // l.element(2);
        int n=sc.nextInt();
        System.out.println("Enter the elements ");
        List<Integer> l=new ArrayList<>();
        for(int i=0 ; i<n ; i++)
        {
            l.add(sc.nextInt());
        }
        sc.close();
        String a=larrysArray(l);
        System.out.println(a);

        
    }
    public static String larrysArray(List<Integer> a) {
        
         for(int i=0 ; i<a.size()-1 ; i++)
         {
             boolean bit=true;
           if(a.get(i)>a.get(i+1) && i!=a.size()-2)
           {boolean val=rotate(a,i,i+2);
            bit=val;}
            else if(a.get(i)>a.get(i+1) && i==a.size()-2)
            {
              boolean val=rotate(a,a.size()-3,a.size()-1);
              bit=val;
            }
            
           
           if(bit==false)return "NO";
         }
         return "YES";
      }
      public static boolean rotate(List<Integer> a,int b,int c)
    {
        int cal=a.get(b)*2 + a.get(b+1)*4 + a.get(c)*8;
        int sumD=0;
        while(sumD!=cal)
        {
          int temp=a.get(c);
          a.set(c,a.get(b+1));
          a.set(b+1,a.get(b));
          a.set(b,temp);
         sumD=a.get(b)*2 + a.get(b+1)*4 + a.get(c)*8;
          
          if(a.get(b)<a.get(b+1) && a.get(b+1)<a.get(c))return true;
        }
        for(int i=0 ; i<a.size() ; i++)
      {
        System.out.print(a.get(i)+" ");
      }
      return false;  
    }
}
