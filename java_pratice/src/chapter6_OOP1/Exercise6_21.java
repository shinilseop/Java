package chapter6_OOP1;

public class Exercise6_21 {
    public static void main(String[] args) {
        MyTv t= new MyTv();

        t.channel=100;
        t.volume=0;
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);

        t.volume=100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);
    }
}
