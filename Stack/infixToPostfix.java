

import java.util.ArrayDeque;
import java.util.Scanner;

public class infixToPostfix {
       public static void main(String s[]) 
       {
        // char c='a';
        // int a=c; 
        // System.out.println(a);  
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the infix string");
           ArrayDeque<Character> con=new ArrayDeque<>();
           String a=sc.next();
           sc.close();
           for ( Character c: a.toCharArray()) {
               int x=c;
               if(x>=65 && x<=122)
               {
                   System.out.print(c);
               }
               
                  else if(con.isEmpty())
                   {
                       con.push(c);
                   }
                 else  if(c=='('&& con.peek()=='+'||con.peek()=='-'|| con.peek()=='*'||con.peek()=='/')
                   {
                       while(con.isEmpty())
                       {
                           System.out.print(con.pop());
                       }
                   }
                   else if(c=='+'|| c=='-'|| c=='*'|| c=='/'&& con.peek()=='(')
                   {
                       con.push(c);
                   }
                   else if(c==')')
                   {
                       while(true)
                       {
                        if(con.peek()=='(')
                        {
                            con.pop();
                            break;
                        }
                         System.out.print(con.pop());
                         
                       }
                   }
                   else if(c=='*'&& con.peek()=='-'|| con.peek()=='+')
                   {
                       con.push(c);
                   }
                   else if(c=='/'&& con.peek()=='-'|| con.peek()=='+')
                   {
                       con.push(c);
                   }
                   else if(c=='+'&& con.peek()=='*'|| con.peek()=='/')
                   {
                    
                       while(con.isEmpty())
                       {
                        System.out.print(con.pop());
                        if(con.peek()=='*'|| con.peek()=='/')
                        {
                            con.push(c);
                            break;
                        }
                        else
                        {
                            con.push(c);
                        }
                       }
                       
                      
                   }
                   else if(c=='-'&& con.peek()=='*'|| con.peek()=='/')
                   {
                    
                       while(con.isEmpty())
                       {
                        System.out.print(con.pop());
                        if(con.peek()=='*'|| con.peek()=='/')
                        {
                            con.push(c);
                            break;
                        }
                        else
                        {
                            con.push(c);
                        }
                       }
                     
                      
                   }
                   else if(c=='-'&& con.peek()=='+')
                   {
                   
                    while(con.isEmpty())
                    {
                     System.out.print(con.pop());
                     if(con.peek()=='*'|| con.peek()=='/')
                     {
                         con.push(c);
                         break;
                     }
                     else
                     {
                         con.push(c);
                     }
                    }
                   }
                   else if(c=='+'&& con.peek()=='-')
                   {
                       con.push(c);
                   }
                   else if(c=='/'&& con.peek()=='*')
                   {
                    
                    while(con.isEmpty())
                    {
                     System.out.print(con.pop());
                     if(con.peek()=='^')
                     {
                         con.push(c);
                         break;
                     }
                     else
                     {
                         con.push(c);
                     }
                    }
                   }
                else if(c=='*'&& con.peek()=='/')
                {
                    con.push(c);
                }

               }
               if(con.isEmpty())
               {

               }
               else
               {
                   while(true)
                   {
                      System.out.print(con.pop());
                      if(con.isEmpty())
                      {
                          break;
                      }
                   }
               }
           }
         
}
