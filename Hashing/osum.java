import java.util.HashSet;
import java.util.Scanner;
public class osum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
 
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        boolean val=FindZeroSum(a,n);
        System.out.print(val);
    }
    static boolean FindZeroSum(int a[],int n){
        HashSet<Integer> h=new HashSet<Integer>();
        int sum=0;
        for(int i=0 ; i<n ; i++)
        {
            sum+=a[i];
            if(h.contains(sum))return true;
            else if(sum==0)return true;
            else
            h.add(sum);
        }
        return false;
    }
}
