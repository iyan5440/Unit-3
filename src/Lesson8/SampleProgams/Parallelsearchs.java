package Lesson8.SampleProgams;


import java.util.Scanner;


public class Parallelsearchs {

    
    public static void main(String[] args) {
        String name[] = {"BOB","SUE","JOE","ANDY","KIM"};
    //ages are in the same order as names =parallel array
    int age[] = {45,17,21,35,57};
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter name to search for age > ");
    String searchName = s.nextLine();
    
    int loc = -1;
        for (int i = 0; i < name.length; i++) {
            if(searchName.equals(name[i])) loc =i;
        }
        if(loc==-1) System.out.format("%s not found",searchName);
        else System.out.format("age is %s",age[loc]);
    }
    
}
