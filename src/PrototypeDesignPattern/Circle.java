package PrototypeDesignPattern;

public class Circle implements Prototype{

    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    public Circle(Circle source){
        this.radius=source.radius;//deep copy
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    public void draw(){
        System.out.println("Circle is have radius : "+radius);
    }
}
