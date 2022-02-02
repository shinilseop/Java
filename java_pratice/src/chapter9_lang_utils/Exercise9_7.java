package chapter9_lang_utils;

public class Exercise9_7 {
    static boolean contains(String src, String target) {
        int pos = src.indexOf(target);
        if(pos != -1)
            return true;
        return false;
//        return src.indexOf(target)!=-1;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
