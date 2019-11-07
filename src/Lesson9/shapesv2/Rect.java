
package Lesson9.shapesv2;


import TurtleGraphics.Pen;
import java.awt.Color;


public class Rect extends abstractshape{

    private double width, height;
    
    public Rect(double x, double y, double w, double h){
        super(x,y);
        width =w;
        height =h;
    }

    public Rect(){
        super();
        width =10;
        height =10;
    }


    public double area() {
        return width*height;
    }


    public void draw(Pen p) {
         p.up();
         p.move(xPos,yPos);
         p.down();
         p.setDirection(0);
         p.move(width);
         p.turn(-90);
         p.move(height);
         p.turn(-90);
         p.move(width);
         p.turn(-90);
         p.move(height);
    }

    public double perimeter(){
        double peri = 2*(width+height);
        return peri;
    }

    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }
    
    public String toString(){
        String str = "Rect\n======\n";
        str+=super.toString();
        str+= "\nWidth: " + width + "\nHeight: " + height;
        str+= "\nPerimeter " + perimeter();      
        
        return str;
    }
    
}
