
import java.util.Scanner;

public class ana {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    boolean val=checkAnagram(a,b);
    if(val==true)System.out.println("Yes");
    else System.out.println("No");
    sc.close();
 }
 static boolean checkAnagram(String a,String b)
 {
    if(a.length()!=b.length())return false;
    int m[]=new int[256];
  
for(int i=0 ; i<a.length() ; i++)
{
    m[a.charAt(i)]++;
    m[b.charAt(i)]--;
}
for(int i=0 ; i<256 ; i++)
{
    if(m[i]!=0)return false;
}
return true;
    
 }

}
