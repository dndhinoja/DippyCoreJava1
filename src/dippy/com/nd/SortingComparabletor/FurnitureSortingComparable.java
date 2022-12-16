package dippy.com.nd.SortingComparabletor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FurnitureSortingComparable {

    public static void main(String[] args){
        Furniture furniture1 = new Furniture("Chair",12);
        Furniture furniture2 = new Furniture("table",11);
        Furniture furniture3 = new Furniture("Rack",16);

        List<Furniture> listOfFurniture = new ArrayList<>();

        listOfFurniture.add(furniture1);
        listOfFurniture.add(furniture2);
        listOfFurniture.add(furniture3);

        Collections.sort(listOfFurniture);

        for(Furniture furniture:listOfFurniture){
            System.out.println(furniture.getName());
        }
    }
}
