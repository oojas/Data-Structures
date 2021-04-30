

import java.util.Scanner;

public class sumOfnaturalnumbers {
 public static void main(String s[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the limit of the natural number");
     int n=sc.nextInt();
     sc.close();
     System.out.print(sum(n));
 }   
public static int val=1;
 public static int sum(int n)
 {
     if(n==0)return 0;
     if(n==1)return 1;
      n+=sum(n-1);
      return n;
 }
}
