
package Lesson8.SampleProgams;

public class IceCreamSurvey {

    
    public static void main(String[] args) {
        String survey[][]={
            {"Emily","Chocolate"},
            {"Matt","Vanilla"},
            {"Luke","Strawberry"},
            {"Tristan","Chocolate"},
            {"Laura","Vanilla"},
            {"Jason","Strawberry"},
            {"Lucas","Chocolate"},
            {"Zach","Strawberry"},
            {"Jacob","Chocolate"},
            {"Tanner","Strawberry"} 
        };
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print(j==0? "Name:" : "Flavour:");
                System.out.print("\t"+survey[i][j] + "\t");
            }
            System.out.println("");
        }
        
        String cpeople[] = filter(survey,"Chocolate");
        String speople[] = filter(survey,"Strawberry");
        String vpeople[] = filter(survey,"Vanilla");
        System.out.println("Here is a list of chocolate people");
        for (int i = 0; i < cpeople.length; i++) {
            System.out.print(cpeople[i]+ ", ");
        }
        System.out.println("\nHere is a list of Strawberry people");
        for (int i = 0; i < speople.length; i++) {
            System.out.print(speople[i]+ ", ");
        }
        System.out.println("\nHere is a list of Vanilla people");
        for (int i = 0; i < vpeople.length; i++) {
            System.out.print(vpeople[i]+ ", ");
        }
    }
    
    public static String[] filter(String data[][],String flav){
        String results="";
        //go thru data looking fort flav in spot [i]
        for (int i = 0; i < data.length; i++) {
            if(flav.equals(data[i][1]))
                results+= data[i][0]+ ","; //matt,Jason
        }
        return results.split(","); //splits string at every , into an array item
    }
    
}
