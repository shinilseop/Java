package chapter6_OOP1;

public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHNNAEL = 1;

    void turnOnOff() {
        isPowerOn = !isPowerOn;
    }

    void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    void volumeDown() {
        if (MIN_VOLUME < volume) {
            volume--;
        }
    }

    void channelUp() {
        if (channel < MAX_CHANNEL) {
            channel++;
        }
    }

    void channelDown() {
        if (MIN_CHNNAEL < channel) {
            channel--;
        }
    }
}
