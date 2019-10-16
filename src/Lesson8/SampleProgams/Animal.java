
package Lesson8.SampleProgams;


public class Animal {
    private String name;
    private double wei;
    public Animal(String n, double w){

        name = n;
        wei = w;
    }
    
    public void grow(){
        wei += .2 * wei;
    }
    
    public String toString(){
        String str = String.format("Name: %s", name);
        str+= String.format("\tWeight: %.2f",wei);
        return str;
    }
    
    public void setName(String nm){
        name = nm;
    }
    
}

