package chapter7_OOP2;

abstract class Unit {
    int x,y;

    Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춤");
    }
}
