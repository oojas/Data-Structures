import java.util.Scanner;


public class boundaryElements {
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
            for(int j=0 ; j<m ; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        boundary(a,n,m);
        }
        public static void boundary(int a[][],int n,int m)
        {
            if(m==1)
            {
                for(int i=0 ; i<m ; i++)
                {
                    System.out.print(a[0][i]+" ");
                }

            }
            else if(n==1)
            {
                for(int i=0 ; i<n ; i++)
                {
                    System.out.print(a[i][0]+" ");
                }
            }
            else
            {
               for(int i=0 ; i<m ; i++)
               {
                   System.out.print(a[0][i]+" ");
               }
               for(int i=1 ; i<n ; i++)
               {
                 System.out.print(a[i][n-1]);
               }
               for(int i=n-2 ; i>=0 ; i++)
               {
                   System.out.print(a[m-1][i]+" ");
               }
               for(int i=m-2 ; i>0 ; i++)
               {
                   System.out.print(a[i][0]+" ");
               }
            }
        }
}
