package Arrays;

import java.util.Scanner;

public class reverseArray {
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
      reverse(a);
  }    
  public static void reverse(int a[]){
     
      if(a.length%2==0){
         reverseEven(a);
      }
      else
      {
       reverseOdd(a);
  }
  
  }
  public static void reverseOdd(int a[]){
    for(int i=0,j=a.length-1 ;i<=j; i++,j-- ){
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;

     }
  
  for(int i=0 ; i<a.length ; i++){
      System.out.print(a[i]+" ");
  }

}
public static void reverseEven(int a[]){
    for(int i=0,j=a.length-1 ;i<j ; i++,j-- ){
        int temp;
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
      }
      for(int i=0 ; i<a.length ; i++){
        System.out.print(a[i]+" ");
    }
}
}
