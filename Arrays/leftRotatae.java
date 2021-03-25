package Arrays;

import java.util.Scanner;

public class leftRotatae {
    public static void main(String s[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
       n= sc.nextInt();
        int a[]=new int[n];
          System.out.println("Enter the elements of the array");
          for(int i=0 ; i<n ; i++){
              a[i]=sc.nextInt();

          }
          System.out.println("Enter the factor by which you want to rotate");
          int d=sc.nextInt();
          sc.close();
          leftRotatenaive(a,d);

    }
    public static void leftRotatenaive(int a[],int d){
         for(int i=0 ; i<d ; i++){
             leftRotatebyOne(a);
         }
         result(a);
    }
    public static void result(int a[]){
        System.out.println("The rotated array is ");
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void leftRotatebyOne(int a[]){
        int temp=a[0];
        for(int i=1 ; i<a.length ; i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
       
    }

}
