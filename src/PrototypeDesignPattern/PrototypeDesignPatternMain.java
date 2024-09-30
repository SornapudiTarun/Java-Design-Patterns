package PrototypeDesignPattern;

public class PrototypeDesignPatternMain {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(15);
        Rectangle originalRectangle = new Rectangle(5,8);
        originalCircle.draw();
        originalRectangle.draw();

        System.out.println("Now Cloned data");
        Circle clonedCircle = originalCircle.clone();
        Rectangle clonedRectangle = originalRectangle.clone();
        clonedCircle.draw();
        clonedRectangle.draw();

    }
}
