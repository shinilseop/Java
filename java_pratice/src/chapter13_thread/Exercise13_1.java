package chapter13_thread;

public class Exercise13_1 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();

        new Thread(th1).start();
    }
}
