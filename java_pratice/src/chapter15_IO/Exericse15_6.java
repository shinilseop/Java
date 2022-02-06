package chapter15_IO;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exericse15_6 {
    static String[] argArr;
    static File curDir;

    static {
        try{
            curDir = new File(System.getProperty("user.dir"));
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            try{
                String prompt = curDir.getCanonicalPath() + ">>";
                System.out.println(prompt);

                String input = s.nextLine();

                input = input.trim();
                argArr = input.split(" +");

                String command = argArr[0].trim();

                if ("".equals(command)) {
                    continue;
                }

                command = command.toLowerCase();

                if (command.equals("q")) {
                    System.exit(0);
                } else if (command.equals("cd")) {
                    cd();
                } else {
                    for (int i = 0; i < argArr.length; i++) {
                        System.out.println(argArr[i]);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("입력오류입니다.");
            }
        }
    }

    public static void cd() {
        if (argArr.length == 1) {
            System.out.println(curDir);
            return;
        } else if (argArr.length > 2) {
            System.out.println("USAGE : cd directory");
            return;
        }

        try{
            String subDir = argArr[1];
            if (subDir.equals("..")) {
                curDir = curDir.getParentFile();
            } else if (subDir.equals(".")) {
                System.out.println(curDir.getCanonicalPath());
            } else {
                File newDir = new File(curDir, subDir);
                if (newDir.exists() && newDir.isDirectory()) {
                    curDir = newDir;
                } else {
                    System.out.println("유효하지 않은 디렉토리입니다.");
                }
//                File[] subList = curDir.listFiles();
//                for (File file : subList
//                ) {
////                    System.out.println(file.getName()+" compare "+subDir);
//                    if (file.isDirectory() && file.getName().equals(subDir)) {
//                        curDir = new File(curDir.getCanonicalFile()+"/"+subDir);
//                        return;
//                    }
//                }
//                System.out.println("유효하지 않은 디렉토리입니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
