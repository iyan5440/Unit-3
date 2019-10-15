
package Lesson8.SampleProgams;


public class Array2d {


    public static void main(String[] args) {
        int nums[][] = {{34,56,67,67},{43,67,78,88},{67,45,45,77}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }
        int total =sum(nums);
        System.out.format("Average: %d\n",total/12);
        
        System.out.println("Sending original array into add10");
        add10(nums);
        System.out.println("Here is nums now");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println("");
        }
        int x =20;
        add10(x);
        System.out.println(""+x);
        
        int avg[] =getAvg(nums);
        System.out.println("The average for each student");
        for (int i = 0; i< avg.length; i++) {
            System.out.println("" + avg[i]);
        }
    }
    
    public static void add10(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]+=10;
            }
            System.out.println("");
        }
    }
    public static void add10(int x){
        x+=10;
    }
    public static int sum(int arr[][]){
        int total =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total+=arr[i][j];
            }
        }
        return total;
    }
    
    public static int[] getAvg(int marks[][]){
        int result[] = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                result[i]+= marks[i][j];
            }
            result[i] = result[i]/marks[i].length;
        }
        return result;
    }
    
    
    
}
