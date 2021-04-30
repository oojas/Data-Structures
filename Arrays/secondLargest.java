

import java.util.Scanner;

public class secondLargest {
    public static void main(String s[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
         System.out.println("Enter the elements of the array");
         for(int i=0 ; i<n ; i++){
             a[i]=sc.nextInt();
         }
         sc.close();
         int b=findsecondLargest(a);
         if(b==-1){
             System.out.println("There is no scoend largest element in the array");
         }
         else
         {
             System.out.println("The second laregst element of the array is " + b);
         }
         System.out.println(a.length);
    }
    public static int findsecondLargest(int a[]){
        int j=large(a);
       // System.out.println(j);
        int res=-1;
        for(int i=0 ; i<a.length ; i++){
                  if(a[j]!=a[i]){
                      if(res==-1){
                          res=i;
                      }
                     else if(a[res]<a[i]){
                              res=i;
                          }
                      
                  }
        }
       // System.out.println(res);
        if(res==-1){
            return res;
        }
        else
        {
            return a[res];
        }
    }
    public static int large(int a[]){
        int lg=0;
        for(int i=1; i<a.length; i++){
            if(a[lg]<a[i]){
                lg=i;
            }
        }
       // System.out.println(lg);
        return lg;
    }
}
