package Arrays;

import java.util.Scanner;

public class secondSmallest {
    public static void main(String s[]){
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0 ; i<n ; i++){
           a[i]=sc.nextInt();
       }
       sc.close();
       int val=findsecondSmallest(a);
       System.out.println("The second smallest element is "+val);
    }
    public static int findsecondSmallest(int a[]){
        int small=smallest(a);
        int res=-1;
        for(int i=0 ; i<a.length ; i++){
            if(a[i]!=a[small]){
                if(res==-1){
                    res=1;
                }
                else if(a[res]>a[i]){
                    res=i;
                }
            }
        
        }
        return a[res];
        
    }
    public static int smallest(int a[]){
        int small=a[0];
        for(int i=1 ; i<a.length ; i++){
            if(small>a[i]){
                small=a[i];
            }
           
        }
        return small;
    }
    
}
