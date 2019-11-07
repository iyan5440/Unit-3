
package Lesson9.shapev1;

import TurtleGraphics.*;
import java.util.Scanner;


public class MakeShapes {


    public static void main(String[] args) {
        
        wheel w = new wheel(10,10,50,6);
        System.out.println("Wheel is at " + w.getXPos() + "," +w.getYPos());
        
        
        /*
        Circle c = new Circle(50,50,100);
        shape c1 = new Circle(50,50,100);
        Rect r = new Rect(100,100,150,50);
        shape r1 = new Rect(100,100,150,50);
        
        shape shapes[] = new shape[10];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = i % 2==0? new Circle(10,10,10) : new Rect(10,10,10,10);
        }
        System.out.println("" + c.area());
        
        shape silly = new Circle(0,0,0);
        //silly = new Rect(120,100,100,100);
        
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        p.move(5);
        //silly.draw(p);
        silly = new Circle(0,0,100);
        silly.draw(p);
        System.out.println(silly.toString());*/
        
        shape shp[] = new shape[10];
        for (int i = 0; i < shp.length; i++) {
            if(i<3) shp[i] = getRandCircle();
            else if(i <8) shp[i] =getRandRect();
            else shp[i] = getRandWheel();
            System.out.println(shp[i]);
        }
        //draw all 10 shapes
        StandardPen p = new StandardPen(new SketchPadWindow(640,480));
        for (shape shape: shp) {
            shape.draw(p);
        }
        //resize each shape slightly bigger
        Scanner s = new Scanner(System.in);
        
        for (shape shape : shp) {
            System.out.println("Press any key to shrink a shape");
            s.nextLine();
            shape.erase(p);
            shape.stretchBy(.5);
            shape.draw(p);
        }
        
        for (shape shape : shp) {
            System.out.println("Press any key to move a shape");
            s.nextLine();
            shape.erase(p);
            shape.move(shape.getXPos()+50, shape.getYPos()+50);
            shape.draw(p);
        }
        
        
        
        System.out.println("Press any key to turn all circles green");
        
        for (shape shape : shp) {
            if(shape instanceof Circle || shape instanceof wheel)
                ((Circle)shape).turnGreen(p);
            if(shape instanceof wheel)
                System.out.println(shape);
            //this is what casting an object looks like
        }
        
        System.out.println("And wheels have had their spokes set to 20");
        for (shape shape : shp) {
            if(shape instanceof wheel){
                shape.erase(p);
                ((wheel)shape).setSpoke(20);
                shape.draw(p);
            }
        }
        
    }
    
    public static Circle getRandCircle(){
        //xPos & y -> -200 to + 200 //rad = 50  to 100
        Circle temp = new Circle(
                (Math.random() * 400 - 200),
                (Math.random() * 400 - 200),
                (Math.random() * 50 + 50));
        
        return temp;
    }
    public static wheel getRandWheel(){
        //xPos & y -> -200 to + 200 //rad = 50  to 100
        wheel temp = new wheel(
                (Math.random() * 400 - 200),
                (Math.random() * 400 - 200),
                (Math.random() * 50 + 50),5);
        
        return temp;
    }
    public static Rect getRandRect(){
        //xPos & y -> -200 to + 200 //rad = 50  to 100
        Rect temp1 = new Rect(
                (Math.random() * 400 - 200),
                (Math.random() * 400 - 200),
                (Math.random() * 100 + 50),
                (Math.random() * 100 + 50));
        
        return temp1;
    }
    
}
