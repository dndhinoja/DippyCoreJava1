package dippy.com.nd;

import java.util.*;

public class EnumerationAndIteration {
    public static void main(String[] args) {
        /*Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        Enumeration<Integer> e  = v.elements();
        while (e.hasMoreElements()){
            //System.out.println(e.nextElement());
        }*/

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(30);
        list.add(5);
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            Integer j = i.next();
            System.out.println(j);
            if(j.equals(10)) {
                System.out.println("Removing value: "+j);
                list.remove(j);
            }
        }
        System.out.println(list);
    }
}
