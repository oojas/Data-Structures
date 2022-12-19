import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class hashSet {
    public static void main(String[] args) {
        
        HashSet<String> h=new HashSet<>();
        h.add("Ojas");
        h.add("value");
        System.out.println(h.contains("Ojas"));
        Iterator<String> i=h.iterator(); // We can also use for each loop tp traverse through the hash set.
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println(h.size());
        System.out.println();
        HashSet<String> s=new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values needed");
        int n=sc.nextInt();
        for(int j=0 ; j<n ; j++)
        {
              s.add(sc.next());
        }
        for(String str:s)
        {
            System.out.print(str+" ");
        }
        sc.close();
        ArrayList<Integer> l=new ArrayList<>();

    }
}
