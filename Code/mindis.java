import java.util.Scanner;
import java.util.ArrayDeque;
public class mindis {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0 ; i<t ; i++)
		{
		   int x=sc.nextInt();
		   String s=sc.next();
          ArrayDeque<Integer> q=new ArrayDeque<>();
          int res=Integer.MAX_VALUE;
          for(int j=0 ; j<x ; j++)
          {
             if(q.isEmpty()== true && s.charAt(j)=='1'){q.push(j);continue;}
             if(q.isEmpty()==false && s.charAt(j)=='1')
             {
                 if((j-q.peek())<3)
                 {
                     res=Integer.min(res,j-q.peek());
                     q.pop();
                     q.push(j);
                 }
                 else 
                 {
                     res=Integer.min(res,j-(q.peek()+2));
                     q.pop();
                     q.push(j);
                 }
             }
          }
		   System.out.println(res);
		}
        sc.close();
	}
}
