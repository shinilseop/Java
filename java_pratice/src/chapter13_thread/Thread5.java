package chapter13_thread;

public class Thread5 extends Thread {
    public void run() {
        for (int i = 0; !Exercise13_7.stopped; i++) {
            System.out.println(i);

            try{
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
