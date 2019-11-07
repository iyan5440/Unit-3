
package Lesson9.shapesv2;


import TurtleGraphics.Pen;
import java.awt.Color;


public class Circle extends abstractshape {
    protected double radius;
    
    public Circle(double x, double y, double r){
        super(x,y);
        xPos = x;
        yPos = y;
        radius =r;
    }


    public Circle() {
        super();
        radius =10;
    }
    


    public double area() {
        return Math.PI * (radius * radius);
    }

    public void draw(Pen p) {
         double side = (2*Math.PI*radius)/120;        
         p.up();
         p.move(xPos,yPos);
         p.setDirection(0);
         p.move(radius);
         p.turn(90);
         p.down();


         for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }

    public void stretchBy(double factor) {
        radius = radius * factor;
    }
    
    public double perimeter(){
        double circ = 2*(Math.PI*radius);
        return circ;
    }
    
    public String toString(){
        String str = "Circle\n======\n";
        str+= String.format("\nArea: %.2f", area());
        str+= String.format("\nCircumference: %.2f", perimeter());
        str+=super.toString();
        return str;
    }
   
    

    
}
