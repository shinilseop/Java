package chapter3_operator;

public class Exercise3_9 {
    public static void main(String[] args){
        /**
         * 알파벳이면 true
         */
        char ch = 'z';
        boolean b = ('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')?true:false;

        System.out.println(b);
    }
}
