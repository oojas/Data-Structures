import java.util.Scanner;

public class Snakeproblem {
    public static void main(String s[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int n=sc.nextInt();
     int m=sc.nextInt();
     System.out.println("Enter the elements of the array");
     int a[][]=new int[n][m];
     for(int i=0 ; i<n ; i++)
     {
         for(int j=0 ;j<m ; j++ )
         {
             a[i][j]=sc.nextInt();
         }
     }
     snake(a);
     sc.close();
  }
  public static void snake(int a[][])
  {
      System.out.println("The snake pattern is as follows");
     for(int i=0 ; i<a.length ; i++)
     {
         if(i%2==0)
         {
             for(int j=0 ; j<a[i].length ; j++)
             {
                 System.out.print(a[i][j]+" ");
             }
         }
         else
         {
             for(int j=a[i].length-1 ; j>=0 ; j--)
             {
                 System.out.print(a[i][j]+" ");
             }
         }
         System.out.println();
     }
  }
}
