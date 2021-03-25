package Arrays;


// import java.util.Arrays;
// import java.util.ArrayList;
import java.util.Scanner;

public class leadersinArray {
    public static void main(String s[]){
        int n;
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0 ; i<n ; i++){
            a[i]=sc.nextInt();

        }
        sc.close();
        chooseLeaders(a);
    }
    //naive approach because the time complexity is o(n2) 
    public static void chooseLeaders(int a[]){
        Boolean val=true;
      
        for(int i=0 ; i<a.length ; i++){
            for(int j=i+1 ; j<a.length ; j++){
                if(a[i]<=a[j]){
                    val=false;
                    break;
                }
            }
            if(val==true){
              System.out.print(a[i]+" ");

            }
            val=true;
            
        }
      //  temp.add(a[a.length-1]);
       
    }
    // Better approach
    public static void leaders(int a[]){
        // ArrayList<Integer> list=new ArrayList<Integer>();
        int current_leader=a[a.length-1];
        int res=0;
        int b[]=new int[a.length];
        for(int i=a.length-2 ; i>=0 ; i--){
            if(a[i]>current_leader){
                b[res]=a[i];
                res++;
            }

        }
    reverse(b);
        
    }
    public static void reverse(int c[]){
        for(int i=0,j=c.length-1 ; i<j ; i++,j--){
          int temp=c[i];
              c[i]=c[j];
              c[j]=temp;
        }
        System.out.println("The leaders are");
        for(int i=0 ; i<c.length ; i++){
            System.out.print(c[i]+" ");
        }
    }
}
