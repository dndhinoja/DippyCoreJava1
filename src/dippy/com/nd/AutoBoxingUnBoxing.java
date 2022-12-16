package dippy.com.nd;
import java.util.ArrayList;
import java.util.List;

public class AutoBoxingUnBoxing {

    public static void main(String[] args){
        List<Integer> listOfInteger = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            listOfInteger.add(i);
            System.out.println(i);
        }
    }
}
