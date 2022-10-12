import java.util.Scanner;
public class subsequence2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a=sc.next();
        boolean val= match(s,a);
        if(val==true)
        {
            System.out.println("Yes");
        }
        else System.out.println("No");
        sc.close();
    }
    static boolean match(String s,String a)
    {
        int j=0,k=0;
      for(int i=0 ; i<s.length() ; i++)
      { 
         if(s.charAt(j)==a.charAt(k))
         {
            k++;
            j++;
         }
         else
         j++;
         if(k==a.length())return true;
       
      }
      return false;
    }
}
