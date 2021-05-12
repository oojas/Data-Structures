import java.util.Scanner;

public class stringtoNum {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings");
        String a=sc.next();
        String b=sc.next();
       String val =sum(a,b);
       System.out.println(val);
        sc.close();
    }
    public static String sum(String num1, String num2)
    {
        StringBuilder sb = new StringBuilder();
        int i=num1.length()-1, j=num2.length()-1, carry=0, sum=0;
        while(i>=0 || j>=0){
            if(i>=0){    
                sum = (carry + (num1.charAt(i--) - '0'));
                carry = 0;
            }
            if(j>=0){
                sum = (carry + sum + (num2.charAt(j--) - '0'));
            }
            sb.append(sum%10);
            carry = sum/10;
            sum = 0;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
