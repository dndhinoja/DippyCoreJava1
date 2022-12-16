package dippy.com.nd;

public class StringTest {

    public static void main(String[] args){
        String s1 = new String("DIPALI");
        String s2 = new String("DIPALI");
        String s3 = "DIPALI";
        String s4 = "DIPALI";


        if(s1==s2){
            System.out.println("same memory location");
        }
        else
            System.out.println("diff memory location");

        if(s3==s4){
            System.out.println("same memory location");
        }
        else
        {
            System.out.println("same memory location");
        }
    }
}

