package chapter7_OOP2;

public class Tank extends Unit {
    boolean isSiegeMode;

    Tank(int x, int y) {
        super(x, y);
        this.isSiegeMode = false;
    }

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("탱크 이동");
    }

    void changeMode() {
        isSiegeMode=!isSiegeMode;
    }
}
