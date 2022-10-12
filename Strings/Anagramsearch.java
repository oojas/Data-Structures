import java.util.Scanner;

public class Anagramsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.next();
        String p=sc.next();
       boolean val= searchAnagram(txt,p);
       System.out.println(val);
       sc.close();
    }
    static boolean searchAnagram(String txt,String p)
    {
     for(int i=0 ; i<=txt.length()-p.length() ; i++)
     {
          if(areAnagram(txt,p, i))return true;
     }
     return false;
    }
    static boolean areAnagram(String s1,String s2,int i)
    {
        int a[]=new int[256];
        
        for(int j=0 ; j<s2.length() ; j++)
        {
            a[s2.charAt(j)]++;
            a[s1.charAt(i+j)]--;
        }
        for(int j=0 ; j<256 ; j++)
        {
            if(a[j]!=0)return false;
        }
        return true;

    }
}
