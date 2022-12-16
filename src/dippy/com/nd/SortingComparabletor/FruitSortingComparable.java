package dippy.com.nd.SortingComparabletor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitSortingComparable {

    public static void main(String[] args){
        List<FruitComparable> fruitComparableList = new ArrayList<FruitComparable>();
        FruitComparable apple = new FruitComparable(1,"apple","red");
        FruitComparable orange = new FruitComparable(3,"orange","orange");
        FruitComparable banana = new FruitComparable(2,"banana","yellow");

        fruitComparableList.add(orange);
        fruitComparableList.add(apple);
        fruitComparableList.add(banana);

        Collections.sort(fruitComparableList);

        for(FruitComparable fruitComparable : fruitComparableList){
           System.out.println(fruitComparable.getFruitName());
        }
    }
}
