
package Lesson8.SampleProgams;



public class Attendance {

    
    public static void main(String[] args) {
        String attend[][] = {
            {"JOE","S09","S12","O14"},
            {"AMY"},
            {"SUE","S24"},
            {"BOB","S05","S23","O11","O23"}
        };
        //print out attendance report
        //any 2d.length = first number, or number of rows
        int abs[] = countsAbs(attend);
        for (int i = 0; i < attend.length; i++) {
            for (int j = 0; j < attend[i].length; j++) {
                System.out.print(j==0? attend[i][j] +" | Total Absences: " + abs[i] + " Dates: " : attend[i][j]+ ", ");
            }
            System.out.println("");
        }
        System.out.println("Here are bobs dates");
        String bdates[] = getDates(attend,"BOB");
        for (int i = 0; i < bdates.length; i++) {
            System.out.print(bdates[i] + "\t");
        }

        
    }
    
    public static String[] getDates(String data[][], String nm){
        String dates = "";
        for (int i = 0; i < data.length; i++) {
            if((data[i][0].equals(nm))){
                for (int j = 1; j < data[i].length; j++) {
                    dates+=data[i][j] + ",";
                }
            }
        }
        return dates.split(",");
    }
    
    public static int[] countsAbs(String data[][]){
        int abs[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            abs[i] = data[i].length - 1; //1st one is not an absence its a name
        }
        return abs;
    }
    
    
}
