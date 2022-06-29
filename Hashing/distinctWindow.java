import java.util.HashMap;
import java.util.Scanner;

public class distinctWindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
       findWindow(a,n,k);
   
    }
    static void findWindow(int arr[],int n,int k){
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0 ; i<k ; i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
        }
        System.out.print(m.size()+" ");
        for(int i=k ; i<n ; i++)
        {
            m.put(arr[i - k],  m.get(arr[i - k]) - 1);
            
            if (m.get(arr[i - k]) == 0) { 
                m.remove(arr[i-k]); 
            }   
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            
            System.out.print(m.size()+" "); 
        }
        }
}
