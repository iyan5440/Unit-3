package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

public abstract class abstractshape {
    
    protected double xPos, yPos;
    
    public abstractshape(double x, double y){
        xPos =x;
        yPos = y;
    }
    
    public abstractshape(){
        xPos =0;
        yPos =0;
    }
    
    
    abstract double perimeter();
    abstract double area();
    abstract void draw(Pen p);
    abstract void stretchBy(double factor);
    
    //final methods can never be over written by child classes
    final public double getXPos() {
        return xPos;
    }

    
    final public double getYPos() {
        return yPos;
    }
    final public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    final public void erase(Pen p){
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    public String toString(){
        String str = "\nXpos: " + xPos + "\nYpos: " + yPos;
        return str;
    }
}
