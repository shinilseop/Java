package chapter7_OOP2;

public class Exercise7_27 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();
        oi.method1();
    }
}
