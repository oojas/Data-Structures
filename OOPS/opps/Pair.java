package opps;
import java.util.Arrays;
import java.util.Scanner;
public class Pair {
   int x;
   int y;
   public Pair(int a,int b)
   {
      this.x=a;
      this.y=b;
   }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      Pair a[]=new Pair[n];
      sol obj=new sol();
      obj.SetName("Ojas");
      obj.SetAge(22);
      obj.Print();
      for(int i=0 ; i<n ; i++)
      {
        a[i]=new Pair(sc.nextInt(), sc.nextInt());
      }
      sc.close();
      maxChainLength(a,n);
      for(int i=0 ; i<n ; i++)
      {
         System.out.print(a[i].x+ " "+a[i].y);
         System.out.println();
      }
   }
   static void maxChainLength(Pair a[],int n)
   {
      Arrays.sort(a,(obj1,obj2)->obj1.y-obj2.y);

   }
}

