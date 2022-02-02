package chapter9_lang_utils;

public class Exercise9_9 {
    public static String delChar(String src, String delCh) {
        boolean isChange = true;
        while (isChange) {
            isChange = false;
            for (int i = 0; i < delCh.length(); i++) {
                int pos = src.indexOf(delCh.charAt(i));
                if (pos != -1) {
                    src = src.substring(0, pos) + src.substring(pos + 1);
                    isChange = true;
                }
            }
        }

        return src;

////        src 에서 delCh 를 찾는 것이 아니라 반대로 함.
//        StringBuffer sb = new StringBuffer(src.length());
//        for(int i=0; i < src.length();i++) {
//            char ch = src.charAt(i);
//
//            if(delCh.indexOf(ch)==-1) // indexOf(int ch)를 호출
//                sb.append(ch);
//        }
//        return sb.toString(); // StringBuffer String 에 저장된 내용을 으로 반환
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> "
                + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> "
                + delChar("(1 2 3 4\t5)", " \t"));
    }
}