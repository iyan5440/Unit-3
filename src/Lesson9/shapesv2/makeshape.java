
package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.util.Scanner;


public class makeshape {


    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        
        abstractshape c; //= new Rect(0,0,50,25); can become any of them
        Circle r;// = new Circle(0,0,25);  can become circle or wheel
        Wheel w;// = new wheel(-75,0,25,3); can become a  Wheel
        
        //s = new shape(10,10); not allowed
        
        c = new Wheel(-75,0,25,3);
        c = new Circle(0,0,25);
        c = new Rect(0,0,50,25);
        
        r = new Circle(0,0,25);
        r = new Wheel(-75,0,25,3);
        
        w = new Wheel(-75,0,25,3);
        
        Scanner s = new Scanner(System.in);
        
        abstractshape b = new Rect(0,0,200,100);
        b.draw(p);
        
        
        System.out.println("Press any key to make it a Circle ");
        s.nextLine();
        b.erase(p);
        b = makeShapeFromAnother(b,'c');
        b.draw(p);
        
        s.nextLine();
        
        System.out.println("Press any key to make it a Wheel ");
        s.nextLine();
        b.erase(p);
        b = makeShapeFromAnother(b,'w');
        b.draw(p);

    }
    
    public static abstractshape makeShapeFromAnother(abstractshape s,char type){
        double x = s.getXPos();
        double y =s.getYPos();
        double area =s.area();
        
        if(type=='r' || type=='R'){
            double width = Math.sqrt(area);
            double height = Math.sqrt(area);
            return new Rect(x,y,width,height);
        }
        else if(type=='C' || type=='c'){
            double radius = Math.sqrt(area/Math.PI);
            return new Circle(x,y,radius);
        }
        else{
            //
            double radius = Math.sqrt(area/Math.PI);
            return new Wheel(x,y,radius,6);
        }
    }
    
}
