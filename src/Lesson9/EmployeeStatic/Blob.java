
package Lesson9.EmployeeStatic;


public class Blob {
    private String name;
    private static int bc;
    public Blob(String x){
        name =x;
        bc++;
    }
    public static String identify(){
        return "We are Blobs";
    }
    public String getName(){
        return name;
    }
    
    public static int getBlobCount(){
        return bc;
    }
}
