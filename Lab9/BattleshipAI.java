/* Brayden Coghill
 * November 21, 2023
 * 300347436
 * Sarah Foss
 * 
 * This program runs an AI in Battleship and finishes the game in less than 65 moves.
 */

import java.util.Scanner;

public class BattleshipAI {

    public static char NO_GUESS = '.';
    public static char MISS = 'O';
    public static char HIT = 'X';
    public static char PATROL = '1';
    public static char SUBMARINE = '2';
    public static char DESTROYER = '3';
    public static char BATTLESHIP = '4';
    public static char AIRCRAFT_CARRIER = '5';
    public static char[][] gameBoard = new char[10][10];
    public static double[][] probabilityBoard = new double[10][10];

    public static void main(String[] args) {

        initializeGameBoard();
        makeGuess(gameBoard);
    }

    // // initialize probability board to 1/100 for each spot on a 10x10 board
    public static void initializeGameBoard() {
        for (double[] row : probabilityBoard) {
            for (int col = 0; col < row.length; col++) {
                row[col] = 1.0 / (probabilityBoard.length * probabilityBoard[0].length);
            }
        }
    }

    public static String makeGuess(char[][] guessBoard) {

        BattleShipTools.printBoard(guessBoard);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        String guess = "";
        String randomString = searchString(guessBoard);
        int row, col;
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        // if a ship is hit, search for the rest of the ship either horizontally or
        // vertically depending on the direction of HIT's direction
        for (row = 0; row < guessBoard.length; row++) {
            for (col = 0; col < guessBoard[row].length; col++) {
                if (guessBoard[row][col] == HIT) {
                    // if there is a hit moving up, keep searching up
                    if (row > 0 && guessBoard[row - 1][col] == NO_GUESS) {
                        guess = printString(row - 1, col);
                        return guess;
                    } else if (row > 1 && guessBoard[row - 1][col] == HIT && guessBoard[row - 2][col] == NO_GUESS) {
                        guess = printString(row - 2, col);
                        up = 1;
                        return guess;
                    } else if (row > 2 && guessBoard[row - 2][col] == HIT && guessBoard[row - 3][col] == NO_GUESS
                            && up == 1) {
                        guess = printString(row - 3, col);
                        up = 2;
                        return guess;
                    } else if (row > 3 && guessBoard[row - 3][col] == HIT && guessBoard[row - 4][col] == NO_GUESS
                            && up == 2) {
                        guess = printString(row - 4, col);
                        return guess;
                    } else if (row > 4 && guessBoard[row - 4][col] == HIT && guessBoard[row - 5][col] == NO_GUESS) {
                        guess = printString(row - 5, col);
                        return guess;
                    } else {
                        break;
                    }
                }
            }
        }

        for (row = 0; row < guessBoard.length; row++) {
            for (col = 0; col < guessBoard[row].length; col++) {
                if (guessBoard[row][col] == HIT) {
                    // if there is a hit moving down, keep searching down
                    if (row < 9 && guessBoard[row + 1][col] == NO_GUESS) {
                        guess = printString(row + 1, col);
                        return guess;
                    } else if (row < 8 && guessBoard[row + 1][col] == HIT && guessBoard[row + 2][col] == NO_GUESS) {
                        guess = printString(row + 2, col);
                        down = 1;
                        return guess;
                    } else if (row < 7 && guessBoard[row + 2][col] == HIT && guessBoard[row + 3][col] == NO_GUESS
                            && down == 1) {
                        guess = printString(row + 3, col);
                        down = 2;
                        return guess;
                    } else if (row < 6 && guessBoard[row + 3][col] == HIT && guessBoard[row + 4][col] == NO_GUESS
                            && down == 2) {
                        guess = printString(row + 4, col);
                        return guess;
                    } else if (row < 5 && guessBoard[row + 4][col] == HIT && guessBoard[row + 5][col] == NO_GUESS) {
                        guess = printString(row + 5, col);
                        return guess;
                    } else {
                        break;
                    }
                }
            }
        }

        for (row = 0; row < guessBoard.length; row++) {
            for (col = 0; col < guessBoard[row].length; col++) {
                if (guessBoard[row][col] == HIT) {
                    // if there is a hit moving left, keep searching left
                    if (col > 0 && guessBoard[row][col - 1] == NO_GUESS) {
                        guess = printString(row, col - 1);
                        System.out.println("Going left pt 1");
                        return guess;
                        // not being reached
                    } else if (col > 1 && guessBoard[row][col - 1] == HIT && guessBoard[row][col - 2] == NO_GUESS) {
                        guess = printString(row, col - 2);
                        System.out.println("Going right pt2");
                        return guess;
                    } else if (col > 2 && guessBoard[row][col - 2] == HIT && guessBoard[row][col - 3] == NO_GUESS) {
                        guess = printString(row, col - 3);
                        System.out.println("Going left pt 3");
                        return guess;
                    } else if (col > 3 && guessBoard[row][col - 3] == HIT && guessBoard[row][col - 4] == NO_GUESS) {
                        guess = printString(row, col - 4);
                        System.out.println("Going left pt 4");
                        return guess;
                    } else if (col > 4 && guessBoard[row][col - 4] == HIT && guessBoard[row][col - 5] == NO_GUESS) {
                        guess = printString(row, col - 5);
                        System.out.println("Going left pt 5");
                        return guess;
                    } else {
                        break;
                    }
                }
            }
        }

        for (row = 0; row < guessBoard.length; row++) {
            for (col = 0; col < guessBoard[row].length; col++) {
                if (guessBoard[row][col] == HIT) {
                    // if there is a hit moving right, keep searching right
                    if (col < 9 && guessBoard[row][col + 1] == NO_GUESS) {
                        guess = printString(row, col + 1);
                        return guess;
                    } else if (col < 8 && guessBoard[row][col + 1] == HIT && guessBoard[row][col + 2] == NO_GUESS) {
                        guess = printString(row, col + 2);
                        return guess;
                    } else if (col < 7 && guessBoard[row][col + 2] == HIT && guessBoard[row][col + 3] == NO_GUESS) {
                        guess = printString(row, col + 3);
                        return guess;
                    } else if (col < 6 && guessBoard[row][col + 3] == HIT && guessBoard[row][col + 4] == NO_GUESS) {
                        guess = printString(row, col + 4);
                        return guess;
                    } else if (col < 5 && guessBoard[row][col + 4] == HIT && guessBoard[row][col + 5] == NO_GUESS) {
                        guess = printString(row, col + 5);
                    } else {
                        break;
                    }
                }
            }
        }

        if (guess.length() == 0) {
            return randomString;
        } else {
            return guess;
        }
    }

    public static String searchString(char[][] guesses) {
        String guess;
        int numGuesses = 0;
        int row, col;
        int numRows = guesses.length;
        int numCols = guesses[0].length;

        for (row = 0; row < guesses.length; row++) {
            for (col = 0; col < guesses[row].length; col++) {
                if (guesses[row][col] != NO_GUESS) {
                    numGuesses++;
                }
            }
        }

        do {
            if (numGuesses == 0 && guesses[row][col] == NO_GUESS) {
                return "B2";
            } else if (numGuesses == 1) {
                return "C3";
            } else if (numGuesses == 2) {
                return "D4";
            } else if (numGuesses == 3) {
                return "E5";
            } else if (numGuesses == 4) {
                return "F6";
            } else if (numGuesses == 5) {
                return "G7";
            } else if (numGuesses == 6) {
                return "H8";
            } else if (numGuesses == 7) {
                return "I9";
            } else if (numGuesses == 8) {
                return "B9";
            } else if (numGuesses == 9) {
                return "C8";
            } else if (numGuesses == 10) {
                return "D7";
            } else if (numGuesses == 11) {
                return "E6";
            } else if (numGuesses == 12) {
                return "F5";
            } else if (numGuesses == 13) {
                return "G4";
            } else if (numGuesses == 14) {
                return "H3";
            } else if (numGuesses == 15) {
                return "I2";
            }
        } while (numGuesses <= 15);

        do {
            row = (int) (Math.random() * numRows);
            col = (int) (Math.random() * numCols);
            if (row % 2 == col % 2 && guesses[row][col] == NO_GUESS) {
                char a = (char) ('A' + row);
                guess = a + Integer.toString(col + 1);
                return guess;
                // once patrol and submarine are sunk search for larger ship by guessing every
                // 3rd spot
            } else if (row % 3 == col % 3 && guesses[row][col] == NO_GUESS) {
                char a = (char) ('A' + row);
                guess = a + Integer.toString(col + 1);
                return guess;
                // once destroyer is sunk search for larger ship by guessing every 4th spot
            } else if (row % 4 == col % 4 && guesses[row][col] == NO_GUESS) {
                char a = (char) ('A' + row);
                guess = a + Integer.toString(col + 1);
                return guess;
            } else if (guesses[row][col] == NO_GUESS) {
                char a = (char) ('A' + row);
                guess = a + Integer.toString(col + 1);
                return guess;
            }
        } while (true);
    }

    public static String printString(int row, int col) {
        char a = (char) ((int) 'A' + row);
        String guess = a + Integer.toString(col + 1);

        System.out.println(guess);

        return guess;
    }
}