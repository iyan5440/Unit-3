
package Lesson9.EmployeeStatic;


public class Employeetester {


    public static void main(String[] args) {
        Employee x,y;
        x = new FTEmployee();
        y = new PTEmployee();
        
        x.setName("Bob");
        y.setName("Joe");
        
        x.setHours(50);
        y.setHours(50);
        
        x.setRate(20);
        y.setRate(20);
        
        System.out.format("%s: %.2f",x.getName(),x.getPay());
        System.out.format("\n%s: %.2f",y.getName(),y.getPay());
        //getTotalPay is a static methods that us run through the class
        System.out.format("\nTotal Pay is %.2f",Employee.getTotalPay());
    }
    
}
