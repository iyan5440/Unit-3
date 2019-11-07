
package Lesson9.shapev1;

import TurtleGraphics.Pen;
import java.awt.Color;


public class Circle implements shape {
    protected double xPos, yPos;
    protected double radius;
    protected static double cc, avgRd =0;
    
    public Circle(double x, double y, double r){
        xPos = x;
        yPos = y;
        radius =r;
        cc++;
        avgRd += r;
        
    }
    
    public static double getavgRd(){
        return avgRd/cc;
    }

    public double area() {
        return Math.PI * radius * radius;
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

    public double getXPos() {
        return xPos;
    }


    public double getYPos() {
        return yPos;
    }


    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }


    public void stretchBy(double factor) {
        radius = radius * factor;
    }
    public String toString(){
        String str = "Circle\n======\n";
        str+= "Xpos: " + xPos + " Ypos: " + yPos;
        str+= "\nRadius: " + radius;
        str+= String.format("\nArea: %.2f", area());
        return str;
    }
    
    public void erase(Pen p){
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
    public void turnGreen(Pen p ){
        erase(p);
        p.setColor(Color.green);
        draw(p);
    }
    
}
