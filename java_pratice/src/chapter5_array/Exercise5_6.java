package chapter5_array;

public class Exercise5_6 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money=" + money);

        for (int i = 0; i < coinUnit.length; i++) {
            if(money/coinUnit[i]>0){
               System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
               money%=coinUnit[i];
            }
        }
    }
}
