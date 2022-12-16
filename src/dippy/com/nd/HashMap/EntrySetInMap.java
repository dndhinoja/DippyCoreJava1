package dippy.com.nd.HashMap;

import java.util.HashMap;
import java.util.Map;

public class EntrySetInMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "JavaScript");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.replace(2,".Net");

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
