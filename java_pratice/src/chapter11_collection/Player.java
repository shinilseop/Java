package chapter11_collection;

public class Player {
    String name;
    SutdaCard c1;
    SutdaCard c2;
    int point; // - 카드의 등급에 따른 점수 새로 추가
    Player(String name, SutdaCard c1, SutdaCard c2) {
        this.name = name ;
        this.c1 = c1 ;
        this.c2 = c2 ;
    }
    public String toString() {
        return "["+name+"]"+ c1.toString() +","+ c2.toString();
    }
}
