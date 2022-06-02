package Packeg1;

public class Figure {
    public Figure(String x){
        System.out.println(x);
    }


    protected double getPerimeter(){
        return 1;
    }
    protected  double getArea(){
        return -1;
    }
    public static final void sayHello(){
        System.out.println("Hello");
    }
}
