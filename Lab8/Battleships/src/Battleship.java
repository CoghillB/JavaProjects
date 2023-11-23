/*Brayden Coghill
 * 300347436
 * November 11, 2023
 * Sarah Foss
 * 
 * This program is designed to play Battleship. The positions of the ships are predefined.
 * The program will prompt the user to enter the row and column of their guess.
 * If the guess is valid, the program will display a message indicating whether the guess
 * is a "Hit" or a "Miss". Once all ships have been sunk, the program will display a message
 * showing the game is over.
 */

import java.util.Scanner;

public class Battleship {
    // creating a variable to store the player's board where it is available to all
    // methods
    private static char[][] playerBoard;
    public static int patrol = 2;
    public static int destroyer = 3;
    public static int battleship = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Battleship!"); // print the welcome message starting the game
        System.out.println();
        playerBoard = playerBoard();
        displayBoard(playerBoard);
        gameLoop(); // call the game loop method to run the game
    }

    // implementing a method to setup the computer board
    public static int[][] computerBoard() {
        int[][] computerBoard = {

                { 2, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 0 },
                { 0, 0, 0, 0, 3, 0 },
                { 0, 0, 0, 0, 3, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 4, 4, 4, 4 } };

        return computerBoard;
    }

    // implementing a method to setup the player's board
    public static char[][] playerBoard() {
        char[][] playerBoard = {
                { '_', '_', '_', '_', '_', '_' },
                { '_', '_', '_', '_', '_', '_' },
                { '_', '_', '_', '_', '_', '_' },
                { '_', '_', '_', '_', '_', '_' },
                { '_', '_', '_', '_', '_', '_' },
                { '_', '_', '_', '_', '_', '_' }, };

        return playerBoard;
    }

    // implement the game loop: prompt player for guess (row and column) and check
    // if guess is valid
    public static void gameLoop() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int[][] computerBoard = computerBoard();

        // implement the loop to keep the game going until all ships are sunk
        do {
            System.out.print("Enter the row (A-F) and column (1-6) of your guess: ");
            String guess = input.nextLine().toUpperCase(); // get the player's guess and convert it to upper case so
                                                           // there are no errors
            System.out.println();
            processGuess(guess, computerBoard); // call the method to process the guess
            displayBoard(playerBoard); // display updated player board
        } while (patrol > 0 || destroyer > 0 || battleship > 0);

        System.out.println();
        System.out.println("You sank all the ships! Thanks for playing!");
    }

    // seperate method to process the player's guess so it is easier to edit
    public static void processGuess(String guess, int[][] computerBoard) {

        int row = guess.charAt(0) - 'A';
        int column = guess.charAt(1) - '1';

        if (playerBoard[row][column] != '_') {
            System.out.println("You have already hit that square!");
        } else if (computerBoard[row][column] == 2) {
            System.out.println("Hit!");
            playerBoard[row][column] = 'X';
            patrol--;
            if (patrol == 0) {
                System.out.println("You sank the Patrol Boat!");
            }
        } else if (computerBoard[row][column] == 3) {
            System.out.println("Hit!");
            playerBoard[row][column] = 'X';
            destroyer--;
            if (destroyer == 0) {
                System.out.println("You sank the Destroyer!");
            }
        } else if (computerBoard[row][column] == 4) {
            System.out.println("Hit!");
            playerBoard[row][column] = 'X';
            battleship--;
            if (battleship == 0) {
                System.out.println("You sank the Battleship!");
            }
        } else {
            System.out.println("Miss!");
            playerBoard[row][column] = 'O';
        }
    }

    public static void displayBoard(char[][] arr) {
        System.out.print("  | ");
        for (char col = '1'; col <= '6'; col++) {
            System.out.print(col + " | ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print((char) ('A' + i) + " | ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
