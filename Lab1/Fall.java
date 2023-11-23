/* Brayden Coghill
 * September 13, 2023
 * 300347436
 * COSC 111 002
 * Instructor: Sarah Foss
 * 
 * This program will compute how far an object has fallen in a given amount of time.
 */
import java.util.Scanner;
public class Fall{
    public static void main(String[]args){
        //Declare variables
        final double ACCELERATION = 9.81;
        double time;
        double distanceAtTimeT;
        Scanner input = new Scanner(System.in); 
        
        //Asking for input from user
        System.out.println("Enter the time in seconds the teenagers were falling for.");
        time = input.nextDouble();
        
        //Calculation 
        distanceAtTimeT = 0.5 * ACCELERATION * (time * time);
        
        //Final output
        System.out.println("The height at which the teenagers jumped from when falling for " + time + " seconds is " + 
        distanceAtTimeT + " meters, or " + (distanceAtTimeT * 3.28) + " feet!");

    }
}