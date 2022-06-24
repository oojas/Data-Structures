import java.util.HashSet;
import java.util.Iterator;

public class basics {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("Ojas");
        h.add("Ritu");
        h.add("Gupta");
        h.add("Mahajan");
        if(h.contains("Ojas"))System.out.println("Present");
        for(String s:h) // More convinient
        {
            System.out.println(s);
        }
        System.out.println();
        Iterator<String> i=h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
