
package Lesson8.SampleProgams;


public class QuizReview {


    public static void main(String[] args) {
        /*
        5 Defs - Parallel arrays, 2D arrays, Ragged arrays, Physical vs logical size
        
        Coding:
        Write a method that adds up all of the number (and returns the total) of all numbers in a 2D array
        
        Write a method that counts how many of a certain number are in a 1D array
        
        1 CodingBat (1 of 2) we'll do both today
        */
        
        int nums[][] = new int[4][5]; 
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i*10+j;
                System.out.print(nums[i][j] + ")\t");
            }
            System.out.println("");
        }
        
        System.out.println("The total of all numbers is ");
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
            }
        }
        System.out.println("" + sum);
        System.out.println("\nProgram 2\n");
        int x[] ={7,8,2,5,7,2,1,6,2,4, 8,1, 7, 5, 3, 5, 8, 9, 3};
        int y[] ={5,8,9,3,8};
        //        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
        int numx = count7(x);
        int numy = count7(y);
        System.out.format("There are %d 7s in x and %d 7s in y\n",numx,numy);
        
        System.out.println("\nCoding Bat Review\n");
        int cb1[] = fizzArray3(11,18);
        for (int i = 0; i < cb1.length; i++) {
            System.out.print(cb1[i] + ", ");
        }
        
        System.out.println("]");
        
        int sib[] = {6,2,5,3};
        int cb2[] = shiftLeft(sib);
        for (int i = 0; i < cb2.length; i++) {
            System.out.print(cb2[i] + ", ");
        }
        System.out.println("]");
    }
    
    
    public static int count7(int arr[]){
    int total =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==7) total++;
        }
        return total;
    }
    
    public static int[] fizzArray3(int start,int end) {
        int result[] = new int[end - start];
        int index=0;
        for(int i=start; i <end; i++){
          result[index] =i;
          index++;
        }
        return result;
    }
    public static int[] shiftLeft(int[] nums) {
        if(nums.length==0) return nums;
        int first = nums[0];
        for(int i=0; i<nums.length-1; i++){
          nums[i] = nums[i+1];
        }
        nums[nums.length-1] = first;
        return nums;
    }

    
}
