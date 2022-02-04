package chapter11_collection;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap test = new HashMap();

        test.put("EE", 200);
        int result = 0;
        result = (int) test.get("QQ");

        System.out.println(result);
    }
}
