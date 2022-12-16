package dippy.com.nd.SortingComparabletor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColourSortingComparable {

    public static void main(String[] args){
        List<ColourComparable> listOfColourComparable = new ArrayList<ColourComparable>();

        ColourComparable colourComparable1 = new ColourComparable(1,"Red",001);
        ColourComparable colourComparable2 = new ColourComparable(2,"Green",002);
        ColourComparable colourComparable3 = new ColourComparable(3,"Yellow",003);

        listOfColourComparable.add(colourComparable1);
        listOfColourComparable.add(colourComparable2);
        listOfColourComparable.add(colourComparable3);

        Collections.sort(listOfColourComparable);

        Iterator<ColourComparable> colourComparableIterator = listOfColourComparable.iterator();
        while(colourComparableIterator.hasNext())
        {
            System.out.println(colourComparableIterator.next().getColourName());
        }
    }
}
