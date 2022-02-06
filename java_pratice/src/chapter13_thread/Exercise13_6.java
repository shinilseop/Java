package chapter13_thread;

public class Exercise13_6 {
    public static void main(String[] args) throws Exception {
        Thread4 th1 = new Thread4();
        th1.setDaemon(true);
        th1.start();

        try{
            th1.sleep(5*1000);
        } catch (InterruptedException e) {

        }

        throw new Exception("꽝~!!!");
    }
}
