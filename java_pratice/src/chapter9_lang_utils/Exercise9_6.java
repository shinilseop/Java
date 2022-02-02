package chapter9_lang_utils;

public class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        }
        if (length <= 0) {
            return "";
        }
        if (src.length() > length) {
            return src.substring(0, length);
        }

        char[] charArr = new char[length];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = '0';
        }

        char[] strArr = src.toCharArray();
        for (int i = 1; i <= strArr.length; i++) {
            charArr[charArr.length - i] = strArr[strArr.length - i];
        }

//        System.arraycopy(src.toCharArray(), 0, charArr, length - src.length(), src.length());
//        return new String(charArr);


        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
