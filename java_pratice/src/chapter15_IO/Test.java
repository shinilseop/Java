package chapter15_IO;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f = new File("./");
        File[] fList = f.listFiles();
        for (int i = 0; i < fList.length; i++) {
            String fileName = fList[i].getName();
            System.out.println(fileName);
        }
    }
}
