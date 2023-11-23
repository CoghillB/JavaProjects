/* Brayden Coghill
 * 300347436
 * October 13/2023
 * Sarah Foss
 * 
 * Program takes input from user either X or O and prints out an X or O in the size the user wants.
*/
import java.util.Scanner;
public class XO{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an X or O"); 
        String answer = input.nextLine();//Assign x or o to answer.

        System.out.println("How big do you want it to be?");
        int size = input.nextInt(); //Get a size from user for the output
        if(answer.equalsIgnoreCase("o")){ //Set condition for first if
            for(int row = 0; row < size; row++ ){//if first for loop is met continues to next loop
                for(int col = 0; col < size; col++){ 
                    if(row == 0){
                        System.out.print("*");
                    }else if(row == size - 1){
                        System.out.print("*");
                    }else if(col == 0){
                        System.out.print("*");
                    }else if(col == size -1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    //Above section forms and "O"
                }

                System.out.println();
            } 
        }else if(answer.equalsIgnoreCase("x")){
            for(int row = 0; row < size; row++){
                for(int col = 0; col < size; col++){
                    if(row == col){
                        System.out.print("*");
                    }else if(col + row == size - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                } //Above section forms an "X"
                System.out.println();
            }
        }   
    }
}