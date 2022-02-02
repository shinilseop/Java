package chapter9_lang_utils;

public class Exercise9_13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를" + stringCount(src, "aa") +"개 찾았습니다.");
    }
    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }
    static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;
        if (key == null || key.length() == 0)
            return 0;

        while (true) {
            index = src.indexOf(key);
            if (index != -1) {
                src = src.substring(index+key.length());
                count++;
            } else {
                break;
            }
        }

//        while((index = src.indexOf(key, pos))!=-1) {
//            count++;
//            pos = index + key.length();
//        }


        return count;
    }

}
