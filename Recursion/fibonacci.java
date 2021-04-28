package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
         System.out.print(printFib(n));
        }
        
        sc.close();
    }
    public static int printFib(int n)
    {
        if(n==0)return 0;
        if(n==1)return 1;
    return printFib(n-1)+printFib(n-2);
    }
}
