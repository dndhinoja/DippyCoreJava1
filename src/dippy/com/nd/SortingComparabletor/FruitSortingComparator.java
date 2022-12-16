package dippy.com.nd.SortingComparabletor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitSortingComparator  {

    public static void main(String[] args) {
        List<FruitComparator> fruitList = new ArrayList<FruitComparator>();
        FruitComparator apple = new FruitComparator(1, "apple", "red");
        FruitComparator orange = new FruitComparator(3, "orange", "orange");
        FruitComparator banana = new FruitComparator(2, "banana", "yellow");

        fruitList.add(orange);
        fruitList.add(apple);
        fruitList.add(banana);

        Collections.sort(fruitList, new FruitColor());

        for(FruitComparator fruit:fruitList){
            System.out.println(fruit.getColour());
        }

        Comparator<FruitComparator> comparator = new Comparator<FruitComparator>() {
            @Override
            public boolean equals(final Object obj) {
                if (!(obj instanceof Comparator)) return false;

                FruitComparator s1 = new FruitComparator(1, "Tony", "");
                FruitComparator s2 = new FruitComparator(2, "Steve", "");

                // checking if both the comparator returns the same value.
                return Integer.signum(this.compare(s1, s2))
                        == Integer.signum(((Comparator<FruitComparator>) obj).compare(s1, s2));
            }

            @Override
            public int compare(final FruitComparator s1, final FruitComparator s2) {
                return s1.getId() - s2.getId();
            }
        };

        NameSorting nameSorting = new NameSorting();
        System.out.println(comparator.equals(nameSorting));
    }
}

class NameSorting implements Comparator<FruitComparator> {

    @Override
    public int compare(FruitComparator o1, FruitComparator o2) {
        return o1.getId()-o2.getId();
    }
}