package chapter13_thread;

import javax.swing.*;

public class Exercise13_9 {
    public static void main(String[] args) throws Exception {
        Exercise13_9_1 th1 = new Exercise13_9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();
    }
}
