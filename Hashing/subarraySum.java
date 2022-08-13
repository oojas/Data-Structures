import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class subarraySum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
       int res[]=demo(a);
       for(int i=0 ; i<n ; i++)
       {
        System.out.print(res[i]+" ");
       }
    }
    static int[]demo(int nums[])
    {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int res[]=new int[nums.length];
        int temp=1;
        left[0]=1;
        for(int i=1 ; i<nums.length ; i++)
        {
            temp*=nums[i-1]*left[i-1];
         left[i]=temp;
        }
        right[nums.length-1]=1;
        temp=1;
        for(int i=1 ; i<nums.length ; i++)
        {
         temp*=nums[i-1]*right[i-1];
         right[i]=temp;
        }
        for(int i=0 ; i<nums.length ; i++)
        {
            res[i]=left[i]*right[i];
        }
        return res;
    }
    public static boolean checkSum(int a[],int sum)
    {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add
        HashSet<Integer> h=new HashSet<Integer>();
        int val=0;
        int count=0;
        for(int i=0 ; i<a.length ; i++)
        {
             val+=a[i];
            if(h.contains(val-sum))count++;
            h.add(val);
        }
        return false;
    }
    static int[] mularray(int []a,int n)
    {
        int res[]=new int[n];
        res[0]=1;
        for(int i=1 ; i<n ; i++)
        {
            res[i]=res[i-1]*a[i-1];
        }
        int pro=1;
        for(int i=n-1 ; i>=0 ; i--){
            res[i]=res[i]*pro;
            pro*=a[i];
        }
        return res;
    }
}