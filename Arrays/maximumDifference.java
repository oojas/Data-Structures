package Arrays;

import java.util.Scanner;

public class maximumDifference{
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
          int b=maxDiff(a);
          System.out.println(b);
    }
    //naive approach because the time complexity is o(n2)
    public static int maxdiff(int a[]){
        int temp=-1;
    ;
for(int i=0 ; i<a.length ; i++){
    for(int j=i+1 ; j<a.length ; j++){
        if(temp==-1){
            
            temp=a[i]-a[j];
            
        }
        else if(temp<a[j]-a[i]){
            temp=a[j]-a[i];
        }
    }
    
}
   return temp; 
}
// Better Approach : time complexity o(n)
   public static int maxDiff(int a[]){
       int res=a[1]-a[0];
       int mini=a[0];
       for(int i=1 ; i<a.length ; i++){
           res=max(res,a[i]-mini);
           mini=min(a[i],mini);
       }
       return res;
   }
   public static int max(int a,int b){
      if(a>b)return a;
      else return b;
   }
   public static int min(int a,int b){
       if(a<b)return a;
       else return b;
   }

}