import java.util.Arrays;
import java.util.Scanner;
public class Battleship {
    public static void main(String[] args) {
        int boardLength = 5;
        char ship = '@';
        char ocean = '-';
        char miss = 'O';
        char hit = 'X';
        int shipNumbers = 5;

        System.out.println("\n Welcome to Battleship! \n");
        char[][] board = newBoard(boardLength, ship, ocean, shipNumbers);
        printBattleShip(board);
        //int[] guessCoordinate = getPlayer1Coordinates(boardLength);
        //char[][] locationP1 = shipPlacement(board, shipNumbers, ocean, ship);
        int undetectedShips = shipNumbers;
        while (undetectedShips > 0) {
            int[] guessCoordinate = getPlayer1Coordinates(boardLength);
            char locationViewUpdate = evaluateGuessAndGetThatTarget(guessCoordinate, board, ship, ocean, hit, miss);
            if (locationViewUpdate == hit) {
                undetectedShips--;

            } /*else {
                int[] guessCoordinate2 = getPlayer2Coordinates(boardLength);
                char locationViewUpdate2 = evaluateGuessAndGetThatTarget(guessCoordinate, board, ship, ocean, hit, miss);
                if (locationViewUpdate == hit) {
                    undetectedShips--;
                }
            }*/
        }


       // getPlayer2Coordinates(boardLength);
        //int[] guessCoordinates2 = getPlayer2Coordinates(boardLength);

    }

    private static char evaluateGuessAndGetThatTarget(int[] guessCoordinate, char[][] board, char ship, char ocean, char hit, char miss) {
        String message;
        int row = guessCoordinate[0];
        int column = guessCoordinate[1];
        char target = board[row][column];
        if (target == ship) {

            message = "Hit!";
            target = hit;

        } else if (target == ocean) {
            message = "Miss!";
            target = miss;
        } else {
            message = "Already hit!";
        }
        //System.out.println(message);
        return target;
    }


    private static int[] getPlayer2Coordinates(int boardLength) {
        int row;
        int col;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Row: ");
            row = input.nextInt();
        } while (row<0 || row> boardLength +1);
        do {
            System.out.print("Column: ");
            col = input.nextInt();
        } while (col< 0 || col > boardLength +1);
        return new int[] {row -1, col - 1};


   }

    private static int[] getPlayer1Coordinates(int boardLength) {
        int row;
        int col;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Row: ");
            row = input.nextInt();
        } while (row < 0 || row > boardLength + 1);
        do {
            System.out.print("Column: ");
            col = input.nextInt();
        } while (col < 0 || col > boardLength + 1);
        return new int[] {row - 1, col - 1};
    }

    private static char[][] newBoard(int boardLength, char ship, char ocean, int shipNumbers) {
        char[][] board = new char[boardLength][boardLength];
        for (char[] row : board) {
            Arrays.fill(row, ocean);
        }
        return shipPlacement(board, shipNumbers, ocean, ship);
    }

    private static char[][] shipPlacement(char[][] board, int shipNumbers, char ocean, char ship) {
        int placedShips = 0;
        int boardLength = board.length;
        System.out.println("Player 1 place you ships on the board!");
        while (placedShips < shipNumbers) {
            int[] location = getPlayer1Coordinates(boardLength);
            char possiblePlacement = board[location[0]][location[1]];
            if (possiblePlacement == ocean) {
                board[location[0]][location[1]] = ship;
                placedShips++;
            }
        }
        System.out.println();
        return board;
    }

// use this method to print game boards to the console
    private static void printBattleShip(char[][] board) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(board[row][column] + " " );
                }
            }
            System.out.println();
        }

    }
}
