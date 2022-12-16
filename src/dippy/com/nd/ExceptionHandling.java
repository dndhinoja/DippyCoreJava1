package dippy.com.nd;

public class ExceptionHandling {

    /*public static void main(String[] args) {
        Thread.sleep(10000);
        System.out.println("Hello Geeks");
    }
}*/


    public void stringInsertion(String string) throws ClassNotFoundException {
        try {
        String a = string;
        //throw new ClassNotFoundException();
         }
        catch (NumberFormatException e){
            e.getMessage();
            System.out.println("Your fault");
        }

    }

    public static void main(String[] args) throws InterruptedException, IllegalAccessException, ClassCastException, ClassNotFoundException {
        ExceptionHandling exceptionHandling = new ExceptionHandling();

        exceptionHandling.stringInsertion(null);


    }
}