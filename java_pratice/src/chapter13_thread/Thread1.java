package chapter13_thread;

public class Thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
        }
    }
}
