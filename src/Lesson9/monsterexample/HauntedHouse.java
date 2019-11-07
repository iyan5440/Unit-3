
package Lesson9.monsterexample;


public class HauntedHouse {


    public static void main(String[] args) {
        Monster m[] = new Monster[4]; //0-3
        
        for (int i = 0; i < m.length; i++) {
            m[i] = i <2? new Zombie(""+i) : new Vampire("" +i);
        }
        System.out.println("Here come the monsters");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].identify());
        }
        System.out.println("And now for the attack!");
        //let x be each monster in the monster array "m"
        for (Monster x : m) {
            x.attack();
        }

    }
    
}
