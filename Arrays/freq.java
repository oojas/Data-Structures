import java.util.Scanner;
public class freq {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0 ; i<n ; i++)
    {
        a[i]=sc.nextInt();
    }
    sc.close();
    printFrequencies(a,n);
}
static void printFrequencies(int a[],int n){
    int count=1;
    for(int i=0 ; i<n ; i++)
    {
        
      int temp=a[i];
      while(i+1<n&&a[i]==a[i+1] ){
        count++;
        i++;
      }
     
      System.out.println(temp+" "+count);
      if(i==n-1)break;
      count=1;
    }

}
}
