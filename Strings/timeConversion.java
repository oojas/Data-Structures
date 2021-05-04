import java.util.Scanner;

public class timeConversion {
 public static void main(String[] args) {
      Scanner sc =new Scanner(System.in); 
      System.out.println("Enter the string");
      String s=sc.nextLine();
      timeConversion1(s);
      sc.close();
    }
    public static void timeConversion1(String s) {
        String a[]=s.split(":");
        boolean val=false;
        if(a[a.length-1].contains("PM"))
            val=true;
            if(val==true)
            {
                StringBuilder n=new StringBuilder();
               for(Character c:a[a.length-1].toCharArray())
               {
                   if(Character.isDigit(c))
                   {
                      n.append(c);
                   }
               }
              int hr=Integer.parseInt(a[0]);
              hr=hr+12;
              System.out.print(hr+":");
              for(int i=1 ; i<a.length ; i++)
            {
                if(a[i].contains("PM"))
                {
                   
                    System.out.print(n);
                    break;
                }
                
                System.out.print(a[i]+":");
            }
               
              }
              else
          {
            StringBuilder n=new StringBuilder();
            for(Character c:a[a.length-1].toCharArray())
            {
                if(Character.isDigit(c))
                {
                   n.append(c);
                }
            }
            for(int i=0 ; i<a.length ; i++)
            {
                if(i==a.length-1)
                {
                   
                    System.out.print(n);
                    break;
                }
              
              System.out.print(a[i]+":");
            }
          }
            }
      }

