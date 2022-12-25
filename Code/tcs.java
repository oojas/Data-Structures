import java.util.Scanner;

public class tcs {
    public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t>0)
	 {
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     int d=sc.nextInt();
	     int e=sc.nextInt();
	     int f=sc.nextInt();
	     int sumD=a+b+c;
	     int sumS=d+e+f;
	     if(sumD!=sumS)
	     {
	         if(sumD>sumS)System.out.println("DRAGON");
	         else System.out.println("SLOTH");
	         continue;
	     }
	     int n=findBig(a,b,d,e);
	     if(n==1)System.out.println("DRAGON");
	     else if(n==2)System.out.println("SLOTH");
	     else System.out.println("TIE");
	     t--;
	 }
	sc.close();
	}
	public static int findBig(int a,int b,int d,int e)
	 {
	     if(a>d)return 1;
	     else if(d>a)return 2;
	     else if(a==d)
	     {
	         if(b>e)return 1;
	         else if(b<e)return 2;
	     }
	     return 0;
	 }
}
