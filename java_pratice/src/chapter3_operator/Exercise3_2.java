package chapter3_operator;

public class Exercise3_2 {
    public static void main(String args[]){
        /**
         *  필요한 바구니의 개수는 ?
         */
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = (numOfApples/sizeOfBucket)+1;

        System.out.println("필요한 바구니의 수 :"+numOfBucket);
    }
}
