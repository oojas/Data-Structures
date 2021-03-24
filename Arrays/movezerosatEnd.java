package Arrays;

import java.util.Scanner;

public class movezerosatEnd {
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
         removeZero(a);
    }
    //o(n2) and o(n) approach
    public static void removeZero(int a[]){
        
  for(int i=0 ; i<a.length ; i++){
      if(a[i]==0){
          for(int j=i+1 ; j<a.length ; j++){
              if(a[j]!=0){
                  int temp=a[j];
                  a[j]=a[i];
                  a[i]=temp;
              }
          }
      }
  }

        
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }    
    //o(n) and o(1) approach
    public static void moveZero(int a[]){
        int count=0;
        for(int i=0 ; i<a.length ; i++){
            if(a[i]!=0){
              int temp=a[i];
              a[i]=a[count];
              a[count]=temp;
              count++;
            }
        }
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }

}
