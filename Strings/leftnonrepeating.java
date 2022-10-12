import java.util.Scanner;

public class leftnonrepeating{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        char val=findnonrepeat(s,s.length());
        System.out.println(val);
    }
    static char findnonrepeat(String s,int n)
    {
        boolean visited[]=new boolean[256];
        for(int i=0 ; i<n ; i++)
        {
            if(visited[s.charAt(i)])continue;
            visited[s.charAt(i)]=true;
        }
        int res=0;
        for(int i=0 ; i<256 ; i++)
        {
            if(visited[i]==false)
            {
                res=i;
                break;
            }
        }
        char i=(char)res;
        return i;
    }
}