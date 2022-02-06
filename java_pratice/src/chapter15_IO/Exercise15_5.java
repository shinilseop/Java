package chapter15_IO;

import java.io.*;

public class Exercise15_5 {
    public static void main(String[] args) {
        String inputFile = "tagTest.html";
        String outputFile = "tagResult.txt";
        try{
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            HtmlTagFilterWriter output = new HtmlTagFilterWriter(new FileWriter(outputFile));

            int ch = 0;

            while ((ch = input.read()) != -1) {
                output.write(ch);
            }

            input.close();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
