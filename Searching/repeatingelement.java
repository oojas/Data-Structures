import java.util.Scanner;

public class repeatingelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;  i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(findMissing(a,n));
        sc.close();
    }
    static int findMissing(int a[],int n)
    {
        int slow=0,fast=0;
        while(fast!=slow)
        {
            slow=a[slow];
            fast=a[a[fast]];
        }
        fast=0;
        while(true)
        {
            slow=a[slow];
            fast=a[fast];
            if(fast==slow)break;
        }
        return slow;
    }
}
