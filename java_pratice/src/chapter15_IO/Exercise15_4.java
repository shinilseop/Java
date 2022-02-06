package chapter15_IO;

import java.io.*;

public class Exercise15_4 {
    public static void main(String[] args) {
//        args = new String[]{"", "", "result.txt", "test.txt", "test2.txt", "test3.txt"};
        args = new String[]{"", "", "result.txt", "test.txt","test2.txt","test3.txt","test4.txt"};

        String resultName = args[2];

        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            File resultFile = new File(resultName);
            resultFile.createNewFile();
            FileWriter fw = new FileWriter(resultFile);
            bw = new BufferedWriter(fw);

            for (int i = 3; i < args.length; i++) {
                File f = new File(args[i]);
                System.out.println(f.getName());
                FileReader fr = new FileReader(f);
                br = new BufferedReader(fr);

                String line = "";
                while ((line = br.readLine()) != null) {
                    bw.write(line+"\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
