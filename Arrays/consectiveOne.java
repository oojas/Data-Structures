import java.util.Scanner;

public class consectiveOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0 ; i<n ; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int res=findOne(a,n);
        System.out.print(res);
    }
    static int findOne(int a[],int n){
        int res=Integer.MIN_VALUE;
        int count=0;
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]==1){
                count++;
                res=Integer.max(res, count);
                continue;
            }
            count=0;
        }
        return res;
    }
}
