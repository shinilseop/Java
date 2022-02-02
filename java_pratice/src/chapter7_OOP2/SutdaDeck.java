package chapter7_OOP2;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 1; i <= CARD_NUM; i++) {
            if(i<=10) {
                if ((i == 1) || (i == 3) || (i == 8))
                    cards[i - 1] = new SutdaCard(i, true);
                else
                    cards[i - 1] = new SutdaCard(i, false);
            } else {
                cards[i - 1] = new SutdaCard(i-10, false);
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int idx = (int) (Math.random() * CARD_NUM);

            SutdaCard tmp = cards[i];
            cards[i] = cards[idx];
            cards[idx] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        int idx = (int) (Math.random() * CARD_NUM);
        return cards[idx];
    }
}
