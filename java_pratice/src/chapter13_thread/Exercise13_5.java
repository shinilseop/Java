package chapter13_thread;

public class Exercise13_5 {
    public static void main(String[] args) throws Exception {
        Thread3 th1 = new Thread3();
        th1.start();

        try{
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {

        }

        throw new Exception("꽝~!!!");
    }
}
