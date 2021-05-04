import java.util.Scanner;

public class transpose {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int a[][]=new int[n][m];
       // String c="";
       // c.contains(b)
      
    
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        
    }
}
