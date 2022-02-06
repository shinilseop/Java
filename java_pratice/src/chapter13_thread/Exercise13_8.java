package chapter13_thread;

import java.util.Scanner;
import java.util.Vector;

public class Exercise13_8 {
    Vector words = new Vector();
    String[] data = {"태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카"};

    int interval = 2*1000;

    WordGenerator wg = new WordGenerator();

    public static void main(String[] args) {
        Exercise13_8 game = new Exercise13_8();

        game.wg.start();

        Vector words = game.words;

        while (true) {
            System.out.println(words);

            String prompt = ">>";
            System.out.print(prompt);

            Scanner s = new Scanner(System.in);
            String input = s.nextLine().trim();

            int index = words.indexOf(input);

            if (index != -1) {
                words.remove(index);
            }
        }
    }

    class WordGenerator extends Thread {
        public void run() {
            while (true) {
                int idx = (int) (Math.random() * data.length);
                words.add(data[idx]);
                System.out.println(words);
                try{
                    Thread.sleep(interval);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
