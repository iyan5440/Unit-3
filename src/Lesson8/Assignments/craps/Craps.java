
package Lesson8.Assignments.craps;

import java.awt.Color;
import java.awt.Graphics;

public class Craps {
    private Dice dice1,dice2;
    private int rollnum,point;
    private int poi[] = {1,4,5,6,8,9,10};
    private int frw[] = {7,11};
    private int frl[] = {2,3,12};
    private boolean newGame;
    
    
    //start with 100
    //
    //-5 first round win 7,11 end+10 
    //-5 first round lose  2,3,12 end
    //-5 first round else point continue
        //nxt round win  if num==lastnum end+
        //nxt round lose 7 end
        //nxt round continue-
    
    Craps(Graphics g1,Graphics g2, int size1, int size2){
        //make 2 dice for 2 panels
        dice1 = new Dice(g1,size1);
        dice2 = new Dice(g2,size2);
        //optional set the Color
        dice1.setColor(Color.red,Color.white);
        dice2.setColor(Color.red,Color.white);
        rollnum=0;
        point=0;
        newGame=true;
        
    }
    
    public void roll(){
        newGame=false;
        rollnum++;
        dice1.roll();
        dice2.roll();
        if(rollnum==1) point = getTotal();
        dice1.draw();
        dice2.draw();
    }
    
    public boolean isNewGame(){
        return newGame;
    }

    public int getTotal() {
        return dice1.getvalue() + dice2.getvalue();
    }
    
    public int getPoint(){
        return point;
    }
    
    public boolean hasWon(){
        if(rollnum==1){ //first  round
            //-5 first round win 7,11 end+10 
            for (int i = 0; i < frw.length; i++) {
                if(getTotal()==frw[i]){
                    rollnum=0;
                    return true;
                }
            }
            
        }
        if(rollnum>1){
            if(point==getTotal()){
                rollnum=0;
                return true;
            }
        }
        return false;
    }
    
    public boolean haslost(){
        if(rollnum==1){
            for (int i = 0; i < frl.length; i++) { //-5 first round lose  2,3,12 end
                if(getTotal()==frl[i]){
                    rollnum=0;
                    return true;
                }
            }
        }
        
        if(rollnum>1){
            if(point!=getTotal()){
                rollnum=0;
                return true;
            }
        }
        return false;
    }
    
    
    
}


