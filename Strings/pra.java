import java.util.Scanner;
public class pra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0 ; i<n ; i++)
        {
            a[0]=sc.next();
        }
        String s=findMaxPre(a,n);
        System.out.println(s);
        sc.close();
    }
    static String findMaxPre(String a[], int n)
    {
        String s="";
        int res=a[0].length();
        for(int i=1 ; i<n ; i++)
        {
           if(res>a[i].length())
           {
               res=a[i].length();
               s=a[i];
           }
        }
        int ans=0;
        for(int i=0 ; i<n ; i++)
        {
            int j=0;
            int count=0;
            while(j<res)
            {
                if(s.charAt(j)!=a[i].charAt(j))break;
                else count++;
                j++;
            }
            ans=Integer.max(ans,count);
        }
        System.out.println(res);
     return s;
    }
}
