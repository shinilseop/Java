package chapter9_lang_utils;

public class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        if((this.num==((SutdaCard)obj).num)&&(this.isKwang==((SutdaCard)obj).isKwang)){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
