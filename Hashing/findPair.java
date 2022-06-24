import java.util.HashSet;
import java.util.Scanner;

public class findPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=sc.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        
        sc.close();
        boolean val=FindPair(a,n,sum);
        System.out.print(val);
    }
    static boolean FindPair(int a[],int n,int sum){
        HashSet<Integer> h=new HashSet<Integer>();
        for(int x:h){
        int temp=sum-x;
        if(h.contains(temp))return true;
        else h.add(temp);
        }
        return false;
    }
}
