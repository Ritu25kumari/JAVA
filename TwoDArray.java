import java.util.*;

public class TwoDArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];



        // //for input
        // //rows
        // for(int i=0; i<rows; i++){
        //     //for columns
        //     for(int j=0; j<cols; j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // //for output
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(numbers[i][j] +" ");
        //     }
        //     System.out.println();
        // }



        

        //Take a matrix as input from the user. 
        //Search for a given number x and print the indices at which it occur.

        //input rows
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x =sc.nextInt();
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                //compare with x
                if(numbers[i][j] == x){
                    System.out.println("x found at location :(" + i + "," + j + ")" );
                }

            }
        }
    }
}