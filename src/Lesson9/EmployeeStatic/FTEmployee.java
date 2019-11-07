
package Lesson9.EmployeeStatic;


public class FTEmployee extends Employee{

    
    public FTEmployee(){
        super();
    }
    
    public double getPay() {
        if (hours <=40){
            Employee.totalPay+= hours * rate;
		return hours * rate;
        }
        else{
            Employee.totalPay+=rate * 40 + (hours-40)*(rate*2);
            return rate * 40 + (hours-40)*(rate*2);
            }
        
    }
    
}
