import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class reversewords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
       System.out.println(reverse(s));
    }
    static String reverse(String s)
    {
       Deque<String> q=new ArrayDeque<>();
       int st=0,i=0;
      for(Character c: s.toCharArray())
      {
        if(c==' ')
        {
            q.push(s.substring(st, i));
            st=i+1;
        }
        i++;
        if(i==s.length()-1)
        {
          q.push(s.substring(st,i+1));
          break;
        }
      }

       StringBuffer m=new StringBuffer();
       while(q.size()!=0)
       {
         m.append(q.pop()+" ");
       }
      return m.toString();
    }
}
