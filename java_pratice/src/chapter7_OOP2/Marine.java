package chapter7_OOP2;

public class Marine extends Unit {

    Marine(int x, int y) {
        super(x, y);
    }

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("마린 이동");
    }

    void stimPack() {
        System.out.println("스팀팩 사용");
    }
}
