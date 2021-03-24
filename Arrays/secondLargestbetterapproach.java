package Arrays;

import java.util.Scanner;

public class secondLargestbetterapproach {
  public static void main(String s[]){
      int n;
      System.out.println("Enter the size of the array");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements of the array");
      for(int i=0 ; i<n ;i++){
           a[i]=sc.nextInt();
      }
      sc.close();
      int b=secondLargest(a);
      System.out.println("The second laregst element in the array is "+ b);
  }  
  public static int secondLargest(int a[]){
      int res=-1;
      int large=a[1];
      int secondLarge=a[0];
      for(int i=2 ; i<a.length ; i++){
          if(a[i]>large){
              
              secondLarge=large;
              large=a[i];
          }
          else if(a[i]<large){
              if(res==-1){
                  res=i;
              }
              if(secondLarge>a[i]){}
              if(secondLarge<a[i]){
                  secondLarge=a[i];
              }
          }
      }
      return secondLarge;
  }
}
