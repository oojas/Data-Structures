import java.util.Scanner;

public class implementation {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int a[][]=new int[m][n];
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n  ; j++)
            {
                a[i][j]=sc.nextInt();
            }
      
        }
        sc.close();
        System.out.println("Enter the elements are");
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
