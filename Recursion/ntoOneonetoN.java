package Recursion;

import java.util.Scanner;

public class ntoOneonetoN {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        onetoNtail(n,1);
        sc.close();
    }
    public static void printntoOne(int n)
    {
        if(n==0)return;
        System.out.print(n+" ");
        printntoOne(n-1);
    }
    public static void onetoN(int n)
    {
        if(n==0)return ;
        onetoN(n-1);
        System.out.print(n+" ");
    }
    public static void onetoNtail(int n,int k)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(k+" ");
         onetoNtail(n-1, k+1);
    }
}
