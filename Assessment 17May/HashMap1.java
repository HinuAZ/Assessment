import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class HashMap1{
 
    public static void main(String a[]){
        Map<String, Integer> obj = new HashMap<String, Integer>();
        obj.put("a", 2);
        obj.put("b", 4);
        obj.put("c", 1);
        
        Set<Entry<String, Integer>> set = obj.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}