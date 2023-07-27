package Project2;

public class TestAbstraction {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        Circle1 c = new Circle1();
        c.draw();
        Shape s1 = new Rectangle();
        s1.draw();
        Shape s2 = new Circle1();
        s2.draw();
    }
}
