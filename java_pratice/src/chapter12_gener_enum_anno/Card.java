package chapter12_gener_enum_anno;

public class Card {
    public enum Kind {CLOVER, HEART, DIAMOND, SPADE}
    public enum Number {
        ACE, TWO, THREE, FOUR, FIVE,
        SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING
    }

    Kind kind;
    Number num;

    public Card() {
        this(Kind.SPADE, Number.ACE);
    }

    public Card(Kind kind, Number num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return "[" + kind.name() + "," + num.name() + "]";
    }
}
