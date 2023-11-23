/* Brayden Coghill
 * 300347436
 * COSC 111 002
 * September 26, 2023
 * Sarah Foss
 * 
 * This game will simulate the game Craps. 
 */

public class Craps{
    public static void main(String[]args){
        //declare and initilize values for come-out roll.
        int dice1 = 1 + (int)(Math.random() * 6);
        int dice2 = 1 + (int)(Math.random() * 6);
        int comeOutRoll = dice1 + dice2;   
        
        //if statement to determain the come-out roll and point number.    
        if(comeOutRoll == 7 || comeOutRoll == 11){
            System.out.println("You rolled a " + comeOutRoll + "." + " You win!");
        }else if(comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12){
            System.out.println("You rolled a " + comeOutRoll + "." + " You lose!");
        }else {
            System.out.println("You rolled a " + comeOutRoll + "." + " That is now your Point.");
            int secondRoll = 0;
            //zero out the dice so secondRoll doesn't immediatly match comeOutRoll
            while(secondRoll != comeOutRoll && secondRoll != 7){
                int dice3 = 1 + (int)(Math.random() * 6);
                int dice4 = 1 + (int)(Math.random() * 6);
                secondRoll = dice3 + dice4;
                //if statement nested inside while statement to determine if the while is true 
                if(secondRoll == comeOutRoll){
                    System.out.print("You rolled a " + secondRoll + "." + " It's a match! You win!");
                }else if(secondRoll == 7){
                    System.out.print("You rolled a " + secondRoll + "." + " Craps! You lose!");
                }else{
                    System.out.println("You rolled a " + secondRoll + "." + " Roll again.");
                }
                }
            }
        } 
    }


