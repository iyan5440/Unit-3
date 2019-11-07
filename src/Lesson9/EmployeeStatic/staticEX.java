
package Lesson9.EmployeeStatic;


public class staticEX {


    public static void main(String[] args) {
        System.out.println(Blob.identify());
        System.out.println("Currently there are " + Blob.getBlobCount() + " blobs.");
        Blob b[] = new Blob[3];
        
        
        b[0] = new Blob("Sammy");
        b[1] = new Blob("Chloe");
        b[2] = new Blob("Mickey");
        
        System.out.println("Hello, I am, " + b[0].getName());
        System.out.println("Hello, I am, " + b[1].getName());
        System.out.println("Hello, I am, " + b[2].getName());
        
        System.out.println(b[0].identify());
        System.out.println(b[1].identify());
        System.out.println(b[2].identify());
        System.out.println("Currently there are " + Blob.getBlobCount() + " blobs.");
    }
    
}
