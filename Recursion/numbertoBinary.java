

import java.util.Scanner;

public class numbertoBinary {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        convert(n);
        sc.close();
    }
    public static void convert(int n)
    {
        if(n==0)return;
        convert(n/2);
        System.out.print(n%2+" ");
    }
}
