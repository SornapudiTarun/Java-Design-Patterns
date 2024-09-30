package PrototypeDesignPattern;

public class Rectangle implements Prototype{
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(Rectangle rectangle){
        //deep copy
        this.width= rectangle.width;
        this.height= rectangle.height;

    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    public void draw(){
        System.out.println("Rectangle with width: " + width + " and height: " + height);
    }
}
