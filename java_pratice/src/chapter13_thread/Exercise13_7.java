package chapter13_thread;

public class Exercise13_7 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try{
            Thread.sleep(6 * 1000);
        } catch (InterruptedException e) {

        }

        stopped = true;
        th1.interrupt();
        System.out.println("stopped");
    }
}
