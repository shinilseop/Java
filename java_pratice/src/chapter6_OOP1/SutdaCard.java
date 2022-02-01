package chapter6_OOP1;

public class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this.num = 1;
        this.isKwang = true;
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        return (num + (isKwang ? "K" : ""));
    }
}
