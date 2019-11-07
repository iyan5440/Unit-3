
package Lesson9.shapesv2;


import TurtleGraphics.Pen;


public class Wheel extends Circle{
    
    private double spokes;
    //wheel has 4 properties
    //it inherits x,y,r from circle
    
    public Wheel(double x, double y, double r,double s){
        super(x,y,r); //call the parent class constructor another name for parent class
        spokes =s;
    }
    public Wheel(double s){
        super();
        spokes = s;
    }
    
    //all methods from circle are available to wheel by default
    
    /*
    some methods -> area, get x&y, stretchby, move are fine as is from circle
    others -> draw are a good start, but need to be added on to (extended)
    toString -> we will override completely
    */
    public void draw(Pen p){
        //call the parent version of draw
        super.draw(p);
        
        //draw the spokes
        for (int i = 0; i < spokes; i++) {
            p.up();
            p.move(xPos,yPos);
            p.down();
            p.setDirection(i*(360/spokes));
            p.move(radius);
        }
    }
    
    //completely overside the parent
    public String toString(){
        String str = "Wheel\n======\n";
        str+= "\nXpos: " + xPos + "\nYpos: " + yPos;
        str+= "\nRadius: " + radius;
        str+= "\nSpokes: " + spokes;
        str+= String.format("\nArea: %.2f" , area());
        str+= String.format("\nCircumference: %.2f", perimeter());
        return str;
    }
    
    //exclusive method for wheels
    public void setSpoke(int s){
        spokes = s;
    }
}
