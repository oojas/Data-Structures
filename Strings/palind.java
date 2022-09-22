import java.util.Scanner;
public class palind {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
        boolean val=checkPalindrome(s,s.length());
        if(val==true)System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
   static boolean checkPalindrome(String s,int n)
    {
        int e=n-1;
        for(Character c:s.toCharArray())
        {
           if(c==s.charAt(e))
           {
            e--;
            continue;
           }
           else return false;
        }
        return true;
    }
}
