package Packeg1;


import Packeg2.Square;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure("JaVa");
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5,5);
        Square square = new Square(5);

        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());


        System.out.println(square.getPerimeter(2,4));
        System.out.println(square.getArea(4,6));
        System.out.println(figure.getArea());
        System.out.println(figure.getPerimeter());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        //გადატვირთულის შემდეგ გამოძახება;
        System.out.println(rectangle1.getArea(4,6));
        System.out.println(rectangle1.getPerimeter(6,7));

        System.out.println(figure instanceof Figure);
        System.out.println(rectangle instanceof Figure);
        System.out.println(rectangle instanceof Rectangle);
        System.out.println(figure instanceof Rectangle); //false


    }

}
