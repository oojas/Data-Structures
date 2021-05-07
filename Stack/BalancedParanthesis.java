

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis {
   public static void main(String a[])
   {
   ArrayDeque<Character> s=new ArrayDeque<Character>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string ");
    String b=sc.next();
    sc.close();
    boolean val=true;
     for(Character c: b.toCharArray())
     {
         if(c=='(' || c=='{' || c=='[')
         {
             s.push(c);
         }
         else if(c==')')
         {
             if(s.peek()!='(')
             {
                 val=false;
                 break;
             }
             else
             {
                 s.pop();
             }
         }
         else if(c==']')
         {
             if(s.peek()!='[')
             {
                 val=false;
                 break;
             }
             else
             {
                 s.pop();
             }
         }
         else if(c=='}')
         {
             if(s.peek()!='{')
             {
                 val=false;
                 break;
             }
             else
             {
                 s.pop();
             }
         }
     }
     if(val==false || s.size()!=0)
     {
         System.out.println("NO");
     }
     else
     {
         System.out.println("YES");
     }
   }    
}
