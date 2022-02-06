package chapter13_thread;

public class Exercise13_9_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
//                interrupt();
            }
        }

        System.out.println("카운트가 종료되었습니다.");
    }
}
