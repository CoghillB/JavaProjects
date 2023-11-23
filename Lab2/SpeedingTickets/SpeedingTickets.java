/* Brayden Coghill
 * 300347436
 * COSC 111 002
 * September 19, 2023
 * Sarah Foss
 * 
 * This program will take input from the user and give back a fine in dollar amounts for a speeding ticket,
 * based on speed / speed zone / was it a school or construction zone. 
*/

import java.util.Scanner;
public class SpeedingTickets{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //Declare variables
        int speed, speedLimit, schoolOrConstructionZone;

        //Prompt input from user
        System.out.println("Enter the speed of the vehicle. ");
        speed = input.nextInt();
        
        System.out.println("Enter the speed limit. ");
        speedLimit = input.nextInt();
        
        System.out.print("Was it a school or construction zone? (1 for yes, 2 for no) ");
        schoolOrConstructionZone = input.nextInt();
        int speedDifference = speed - speedLimit;

        //Start if statements
        if (schoolOrConstructionZone == 2){
            if (speedDifference <= -20){
                System.out.println("Fine is $121");
            }else if (speedDifference >= 61){
                System.out.println("Fine is $483.");
            }else if (speedDifference >= 41){
                System.out.println("Fine is $368.");
            }else if (speedDifference >= 21){
                System.out.println("Fine is $196.");
            }else if (speedDifference >= 1){
                System.out.println("Fine is $138.");
            }else{
               System.out.println("No Fine.");
            }    //Fines while in school zone or construtcion zone   
        } else if (schoolOrConstructionZone == 1){
            if (speedDifference >= 61){
                System.out.println("Fine is $483.");
            }else if (speedDifference >= 41){
                System.out.println("Fine is $368.");
            }else if (speedDifference >= 21){
                System.out.println("Fine is $253.");
            }else if (speedDifference >= 1){
                System.out.println("Fine is $196.");
            }else
                System.out.println("No Fine.");
        } else {  //If they enter an invalid input
            System.out.println("INVALID");
        }
    }

}


