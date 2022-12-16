package dippy.com.nd.SortingComparabletor;

import java.util.Comparator;

class   FruitColor implements Comparator<FruitComparator>{

        @Override
        public int compare(FruitComparator f1, FruitComparator f2) {

            return f1.getColour().compareTo(f2.getColour());
        }
    }

