
package Lesson9.shapesv2;

import TurtleGraphics.Pen;


public class Triangle extends abstractshape{
protected double x1,x2,x3,y1,y2,y3;
    public Triangle(int a2, int b2,int a3,int b3){
        x1=xPos;
        x2=a2;
        x3=a3;
        y1 = yPos;
        y2 = b2;
        y3 = b3; 
    }
    
    public double perimeter() {
        return Math.sqrt(((x1-x2)*(x1+x2)+(y1-y2)*(y1+y2)) 
                +((x2-x3)*(x2+x3)+(y2-y3)*(y2+y3))
                +((x3-x1)*(x3+x1)+(y3-y1)*(y3+y1)));
        
    }

    
    public double area() {
        return Math.abs((x1*y2-x2*y1)+(x2*y3-x3*y2)+(x3*y1-x1*y3))/2;
    }

    
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2+xPos,y2+yPos);
        p.move(x3+xPos,y3+yPos);
        p.move(xPos,yPos);
    }
    

    
    public void stretchBy(double factor) {
        x2 = (x2-xPos) * factor + xPos;
        x3 = (x3-xPos) * factor + xPos;
        y2 = (y2-yPos) * factor + yPos;
        y3 = (y3-yPos) * factor + yPos;
    }
    
}
