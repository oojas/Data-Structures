package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateElementscount {
    public static void main(String sp[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
       System.out.println("Enter the elements of the array");
       int a[]=new int[n];
       for(int i=0 ; i<n ; i++){
           a[i]=sc.nextInt();
       }
       sc.close();
       int duplicate=countDuplicate(a);
       if(duplicate==0){
           System.out.println("There are no duplicate elements");
       }
       else{
        System.out.println("Number of duplicate elements are "+duplicate);
       }
       
    }
    // naive approach because the time complexity is o(n2)
    public static int findDuplicate(int a[]){
        int count=0;
     for(int i=0 ; i<a.length ;i++){
         for(int j=i+1 ; j<a.length ; j++){
             if(a[i]==a[j]){
                 count++;
             }
         }
     }
    
     return count;
    }
    // better approach because the time complexity here is o(nlogn) and space complexity is o(n)
    public static int countDuplicate(int a[]){
        Arrays.sort(a);
        boolean visited[]=new boolean[a.length];
        
        int count=0;
        for(int i=0 ; i<a.length-1 ; i++){
            if(a[i]==a[i+1] && visited[i]!=true){
                count++;
                visited[i]=true;
                visited[i+1]=true;
            }
            
        } 
        return count;
    }
}
