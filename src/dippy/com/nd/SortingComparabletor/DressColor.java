package dippy.com.nd.SortingComparabletor;

import java.util.Comparator;

public class DressColor implements Comparator<Dress> {


    @Override
    public int compare(Dress o1, Dress o2) {
        return o1.getDressColor().compareTo(o2.getDressColor());
    }
}
