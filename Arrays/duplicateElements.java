package Arrays;

import java.util.Scanner;

public class duplicateElements {
    public static void main(String s[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0 ; i<n ; i++){
           a[i]=sc.nextInt();

        }
        sc.close();
        int b=removeDuplicate(a);
        System.out.println("The final length of the array is "+b);
    }
    public static int findDuplicate(int a[]){
        int b[]=new int[a.length];
        b[0]=a[0];
        int res=1;// because we have added one element into the array so we are taking the resultant legnth of the array as one
     for(int i=1 ; i<a.length ; i++){
         if(b[res-1]!=a[i]){
             b[res]=a[i];
             res++;
         }
         
     }
     for(int i=0 ; i<res  ; i++){
        a[i]=a[i]=b[i];
    }
    
    return res;
    }
    public static int removeDuplicate(int a[]){
        int res=1;
        for(int i=1 ; i<a.length ; i++){
            if(a[res-1]!=a[i]){
                a[res] =a[i];
                res++;   
            }
        }
        for(int i=0 ; i<res ; i++){
            System.out.print(a[i]+" ");
        }
        return res;
    }
}
