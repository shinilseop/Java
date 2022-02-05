package chapter12_gener_enum_anno;

public class Deck {
    final int CARD_NUM = Card.Kind.values().length * Card.Number.values().length;

    Card cardArr[] = new Card[CARD_NUM];

    public Deck() {
        int i = 0;

        for (Card.Kind kind : Card.Kind.values()) {
            for (Card.Number num : Card.Number.values()) {
                cardArr[i++] = new Card(kind, num);
            }
        }
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);

        return cardArr[index];
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
    }
}
