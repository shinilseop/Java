package chapter15_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exercise15_1 {
    public static void main(String[] args) {
        args = new String[]{"10", "test.txt"};

        int line = Integer.parseInt(args[0]);
        String fileName = args[1];
        try {
            File f = new File(fileName);

            if(f.isDirectory()||!f.exists()){
                System.out.println(fileName+"은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
                System.exit(0);
            }

            System.out.println("파일 확인.");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String readline=null;
            int nowLine = 1;
            while((readline = br.readLine()) != null){
                System.out.println((nowLine++)+":"+readline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
