package dippy.com.nd;/*
public class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);

            System.out.println("Current Thread"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                    e.getMessage();
            }
        }

    }
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        MySecondThread mySecondThread = new MySecondThread();

        System.out.println(thread.getName());
        System.out.println(mySecondThread.getName());
        System.out.println(mySecondThread.getId());
        thread.start();
        mySecondThread.start();
    }
}
*/
