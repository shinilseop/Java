package chapter9_lang_utils;

public class Exercise9_10 {
    public static String format(String str, int length, int alignment) {
        if (str.length() > length) {
            return str.substring(0, length);
        }

        char[] chArr = new char[length];
        for (int i = 0; i < chArr.length; i++)
            chArr[i] = ' ';

        switch (alignment) {
            case 0:
                System.arraycopy(str.toCharArray(), 0, chArr, 0, str.length());
                break;
            case 1:
                System.arraycopy(str.toCharArray(), 0, chArr, (chArr.length-str.length())/2, str.length());
                break;
            case 2:
                System.arraycopy(str.toCharArray(), 0, chArr, chArr.length-str.length(), str.length());
                break;
        }

        return new String(chArr);
    }

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str,7,0)); // 왼쪽 정렬
        System.out.println(format(str,7,1)); // 가운데 정렬
        System.out.println(format(str,7,2)); // 오른쪽 정렬
    }
}
