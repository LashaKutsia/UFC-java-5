package Packeg1;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(){
        super("Java");
        this.length = 3;
        this.width = 4;
    }
    public Rectangle(double length, double width){
        super("Java");
        this.length = length;
        this.width = width;
    }


    public double getPerimeter() {
        return 2*(length+width);
    }
    public  double getArea() {
        return length*width;
    }
     protected double getPerimeter(double length, double width){
        this.length = length;
        this.width = width;
        return 2*(length+width);

    }
     protected double getArea(double length, double width){
        this.length = length;
        this.width = width;
        return length*width;

    }

}
