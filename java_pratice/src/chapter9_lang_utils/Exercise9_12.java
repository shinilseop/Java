package chapter9_lang_utils;

public class Exercise9_12 {
    public static int getRand(int from, int to) {
        int min = Math.min(from, to);
        int max = Math.max(from, to);
        int[] arr = new int[max - min + 1];

        for (int i = min, idx = 0; i <= max; i++, idx++) {
            arr[idx] = i;
        }

        return arr[(int)(Math.random()*arr.length)];
//        return (int)(Math.random() * (Math.abs(to-from)+1))+ Math.min(from,to);
    }

    public static void main(String[] args)
    {
        for(int i=0; i< 20; i++)
            System.out.print(getRand(1,-3)+",");
    }
}
