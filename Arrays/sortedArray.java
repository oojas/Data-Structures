

import java.util.*;

public class sortedArray{
    public static void main(String a[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        n=sc.nextInt();
        int b[]=new int[n];
        System.out.println("Enter the elemtns of teh array");
        for(int i=0 ; i<n ; i++){
            b[i]=sc.nextInt();
            System.out.println();
        }
        sc.close();
        Boolean c=checksort(b);
        if(c){
          System.out.println("The array is sorted");
        }
        else 
        System.out.println("The array is not sorted");
    }
    public static Boolean checksort(int a[]){
           Boolean val=true;
           for(int i=0 ; i<a.length-1855 ; i++){
               if(a[i]>a[i+1]){
                   val=false;
                   break;
               }
           }
           return val;
    }
}