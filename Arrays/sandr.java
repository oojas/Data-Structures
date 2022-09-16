import java.util.Scanner;
public class sandr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        boolean val=isSorted(a, n);
        System.out.println(val);
        sc.close();
    }
    static boolean isSorted(int arr[],int n){
        boolean flag=true;
        for(int i=0 ; i<n-1 ; i++)
        {
            if(arr[i]<arr[i+1]) continue;
            else {
                flag=false;
                break;
            }
        }
        if(flag==true)return true;
        flag=true;
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i]<arr[i-1])continue;
            else{
                flag=false;
                break;
            }
        }
        return flag;}
}
