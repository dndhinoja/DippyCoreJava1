package dippy.com.nd.SortingComparabletor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DressSorting {

    public static void main(String[] args){
        List<Dress> listOfDress = new ArrayList<>();
        Dress dress1 = new Dress(1,"Payjama","Red");
        Dress dress2 = new Dress(2,"ChaniyaCholi","Yellow");
        Dress dress3 = new Dress(3,"Lehenga","Blue");

        listOfDress.add(dress1);
        listOfDress.add(dress2);
        listOfDress.add(dress3);

        Collections.sort(listOfDress,new DressColor());

        Iterator<Dress> iterator = listOfDress.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getDressColor());
        }
    }
}
