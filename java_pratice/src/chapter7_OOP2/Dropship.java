package chapter7_OOP2;

public class Dropship extends Unit{
    Dropship(int x, int y) {
        super(x, y);
    }

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("드랍쉽 이동");
    }

    void load() {
        System.out.println("태우기");
    }

    void unload() {
        System.out.println("내리기");
    }
}
