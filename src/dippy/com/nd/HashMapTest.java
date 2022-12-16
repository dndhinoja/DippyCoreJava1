package dippy.com.nd;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args){

    HashMap<Integer,String> vehicle = new HashMap<>();
    vehicle.put(12,"Bike");
    vehicle.put(44,"Car");
    vehicle.put(11,"Cycle");

    String k = "Ea";
    System.out.println(k.hashCode());
    HashMap<String,Integer> company = new HashMap<>();
    company.put("FB",22);
    company.put("Ea",2222);

    HashMap<String,Integer> bodyParts = new HashMap<>();
    bodyParts.put("aa",1);
    bodyParts.put("aa",2);

    HashMap<String,Integer> recipes = new HashMap<>();
    recipes.put(null,1);
    recipes.put("dalmakhani",2);
    recipes.put("dhokla",3);
    recipes.put("sambhar",4);
    recipes.put("paratha",5);
    recipes.put("pulav",6);
    recipes.put("idli",7);
    recipes.put("thepla",8);
    recipes.put("bhakhari",9);
    recipes.put("rotla",10);
    recipes.put("oro",11);
    recipes.put("bhajiya",12);
    recipes.put("pavbhaji",13);
    }



}
