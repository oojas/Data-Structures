
import java.util.HashSet;
import java.util.Scanner;

public class longestdisctinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String txt=sc.next();
        System.out.println(longestString(txt));
        sc.close();
        
    }
    static int longestString(String txt)
    {
        HashSet<Character> s=new HashSet<>();
        int res=1;
        s.add(txt.charAt(0));
        for(Character c:txt.toCharArray())
        {
            if(s.contains(c))
            {
                res=Integer.max(res,s.size());
                s.remove(c);
            }
            else s.add(c);
        }
        return res;
    }
}
