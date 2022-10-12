import java.util.Scanner;

public class printing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
             a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; a[j].length<n ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
        sc.close();
    }
}
