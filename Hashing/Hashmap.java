import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    public static void main(String s[])
    {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Ojas",21);
        hm.put("Rahul",23);
        hm.put("Nisha",25);
        for(Map.Entry<String,Integer> m:hm.entrySet())
        {
            System.out.print(m.getKey()+" "+m.getValue()+" ");
        }

    }
}
