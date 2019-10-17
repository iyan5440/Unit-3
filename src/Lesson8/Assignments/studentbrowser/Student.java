
package Lesson8.Assignments.studentbrowser;



public class Student {
    //define properties of the object
    //instance variables = properties
    //usually declared private
    private String name;
    private int test[] = new int[3];
    
    //constructor
    //public <Name of the Class>
    //This runs when object is made (instantied)
    //With the keyword new
    //mits job is to initialize some or all of the properties
    //properties / instance variables of the object
   

    //another constructor to set all properies as you make it
    public Student(String n,int t[]){
        name=n;
        test = t;
        
        
    }
    //3rd construct to clone properties from another student
    public Student(Student other){
          this(other.name,other.test);
        
    }
    //
    public Student(String nm[],int te[]){
        
    }
    
    //add instance methods to make up the abilities of the student
    //access to name to set it and get it
    public void setName(String n){
        name = n;
    }
    public String getName(){ 
        return name;
    }
    
    public void setMark(int which, int mk){
        if(which==1) test[0] = mk;
        else if(which==2) test[1] = mk;
        else test[2] = mk;
    }
    public int getMark(int which){
        if(which==0) return test[0];
        else if(which==1)return test[1];
        else return test[2];
    }/*
    public int getHighScore(){
        int hs = test[0];
        if(test[1] > hs) hs =test[1];
        if(test[2] > hs) hs =test[2];
        return hs;
    }*/
    public int getAvg(){
        return (test[0] + test[1] + test[2] )/3;
    }
        //toString runs automatically when you print an object
    //all objects get  a toString from parent object class
    //but you can make your own version
    public String toString(){
        String s = "Name:\t\t" + name + "\n";
        s+= ""+getAvg();
        return s;
    }/*
    public String validateData(){
        String em =null;
        if(name.equals("")) //then a name was not entered
            em ="Name is required.";
        if(test[0]<0 || test[0]>100 || test[1]<0 || test[1]>100 || test[2]<0 || test[2]>100){
            if(em==null) //there is no error
                em = "At least 1 mark is out of the accecptable range.";
            else //add on to the message with +=
                em+= "\nAt least 1 mark is out of the accecptable range.";
            if(em!=null) //then we have an error so add the following line after it
                em+= "\nPlease re-enter all the data\n"; 
        }
        return em; //return the error msg, either as null, or with a real message

    }*/
    public String vaildateData(){
        String em =null;
        if(name.equals("")) //then a name was not entered
            em +="\nName is required.\nPlease re-enter all data";
        for (int i = 0; i < 3; i++) {
            if(test[i] < 0 || test[i] > 100){
                em += "\nAt least 1 mark is out of the accecptable range, Please re-enter all the data\n";
            }
            
        }
        return em;
    }
}

