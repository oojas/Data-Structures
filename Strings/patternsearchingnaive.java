import java.util.Scanner;

public class patternsearchingnaive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt =sc.next();
        String p=sc.next();
        search(txt,p);
        sc.close();
    }
    static void search(String txt,String p)
    {
       for(int i=0 ; i<=txt.length()-p.length() ; i++)
       {
        int j;
        for(j=0 ; j<p.length() ; j++)
        {
            if(p.charAt(i)!=txt.charAt(i+j))break;
            
        }
        if(j==p.length())
           System.out.print(i+" ");
       }
    }
}
