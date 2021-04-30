

import java.util.Scanner;

public class largestElement {
    public static void main(String s[]){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0 ; i<n ; i++){
           b[i]=sc.nextInt();
        }
        sc.close();
        int c=large(b);
        System.out.println("The largest element in the array is "+ c);
    }
 public static int large(int a[]) {
        int l=a[0];
        for(int i=1 ; i<a.length ; i++){
            if(a[i]>l){
                l=a[i];
            }
                   }
                   return l;
    }
}
