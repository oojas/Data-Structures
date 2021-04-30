

import java.util.Scanner;

public class sumOfdigits {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        int val=sum(n);
        System.out.println(val);

    }
    public static int sum(int n)
    {
        if(n==0)return 0;
        int val=n%10+sum(n/10);
        return val;
    }
}
