import java.util.Scanner;

public class rotatedstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        boolean val=findRotation(s,p);
        if(val==true)
        {
           System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
    }
    static boolean findRotation(String txt,String p)
    {
       if(txt.length()!=p.length())return false;
       return ((txt+txt).indexOf(p)>=0);

    }
}
