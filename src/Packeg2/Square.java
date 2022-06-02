package Packeg2;

import Packeg1.Rectangle;

 public final class Square extends Rectangle {
     private double side;


     public Square(double side){
         this.side =side;
     }

     public double getPerimeter() {
         return super.getPerimeter(side,side);
     }


     public double getArea() {
         return super.getArea(side, side);
     }
 }
