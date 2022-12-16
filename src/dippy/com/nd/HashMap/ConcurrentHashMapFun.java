package dippy.com.nd.HashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapFun {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "One");
        concurrentHashMap.put(2, "Two");
        concurrentHashMap.put(3, "Three");

        int search = concurrentHashMap.search(3, (k,v) -> {return v.equals("One") ? k: null;});

    }
}
