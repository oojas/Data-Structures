package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String s[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number you want to calculate the factorial of");
      int m=sc.nextInt();
      sc.close();
      int val=fact(m);
      System.out.println(val);
    }
    public static int fact(int n)
    {
        if(n==0)return 1;
        return n*fact(n-1);
    }
}
