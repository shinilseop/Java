package chapter15_IO;

import java.io.*;

public class Exercise15_2 {
    public static void main(String[] args) {
        File f = new File("src/chapter15_IO/Exercise15_2.java");

        try {
            FileInputStream fis = new FileInputStream(f);
            int data = 0;
            int i = 0;

            while ((data = fis.read()) != -1) {
                System.out.printf("%x ", data);
                if(++i%16==0)
                    System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
