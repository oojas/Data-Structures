import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class eggDrop {
    public static class FastReader{
     BufferedReader br;
     StringTokenizer st;
     public FastReader(){
      br=new BufferedReader(new InputStreamReader(System.in));
     }
     String next(){
        if(st==null || !st.hasMoreElements())
        {
           try{
            st=new StringTokenizer(br.readLine());
           }catch(IOException e)
           {
            e.printStackTrace();
           }
            
        }
       
        return st.nextToken();
     }
     int nextInt(){
        return Integer.parseInt(next());
     }
     double nextDouble()
     {
        return Double.parseDouble(next());
     }     
    }
    public static void main(String[] args) {
       FastReader fs=new FastReader();
       eggDrop ed=new eggDrop();
       int f=fs.nextInt();
       int e=fs.nextInt();
       System.out.println(ed.eggDropPuzzle(f,e));
    }
    int eggDropPuzzle(int f,int e) // Navie recursion.
    {
       if(e==1)return f;
       if(f==1)return 1;
       if(f==0)return 0;
       int val=Integer.MAX_VALUE;
       for(int i=1 ; i<=f ; i++)
       {
        int res=Math.max(eggDropPuzzle(f-i, e),eggDropPuzzle(i-1, e-1));
        val=Math.min(res,val);
       }
       return val+1;
    }

     
}
