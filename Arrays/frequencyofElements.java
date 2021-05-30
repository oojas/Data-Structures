import java.util.Scanner;

public class frequencyofElements {
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
       bruteForce(a,n);
   } 
   public static void bruteForce(int a[],int n)
   {
       for(int i=0 ; i<n ; i++)
       {
           int count=0;
           for(int j=i+1 ; j<n ; j++)
           {
            if(a[j]==a[i])count++;
               if(a[j]!=a[i])break;
               
           }
           System.out.println(a[i]+" "+ (count+1));
           i=i+count;
       }
   }
}
