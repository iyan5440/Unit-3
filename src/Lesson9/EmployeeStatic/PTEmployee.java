
package Lesson9.EmployeeStatic;


public class PTEmployee extends Employee {
    
    public PTEmployee(){
        super();
    }
    
    public double getPay(){
        Employee.totalPay+= hours * rate;
        return rate * hours;
    }
    
}
