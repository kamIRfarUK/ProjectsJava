import java.util.Scanner;

public class E_tic_tac_toe {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("\nLets play TIC TAC TOE!");
        //create an array with 3 rows of underscore characters
        char[][] board = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };
        //call the function printBoard()
        printBoard(board);




        //{ Task 3: Loop through turns.
        //    if (X) turn {
        //    Task 4: call askUser().
        //            Task 5: populate the board using askUser's return value.
        //} else {
        //    Task 4: call askUser().
        //            Task 5: populate the board using askUser's return value. Then, pri
        //
        //
        //}
        for(int i=0;i<9;i++){
            if(i%2==0){
                System.out.println("turn:X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            }else {
                System.out.println("turn:O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }

            printBoard(board);

            //  Task 6 Call the function.
            //  if return value == 3 {
            //      print: X wins and break the loop
            //  } else if return value == -3 {
            //  }
            //  print: 0 wins and break the loop

            int count = checkWin(board);
            if( count == 3){
                System.out.println("X wins");
                break;
            }else if(count == -3){
                System.out.println("O wins!");
                break;
            } else if (i == 8) {
                System.out.println("its a TIE!!");
            }
        }

        scan.close();
    }

    //   Task 2
    //Write a function that prints the board.
    //  * Function name printBoard()
    //  @param board (char[] [])
    //  Inside the function:
    //      1. print a new line.
    //      2. print the board.
    //      separate each row by two lines.
    //       E ach row precedes a tab of space
    //      each character in the grid has one space from the other character
    public static void printBoard(char[][] board){
        System.out.print("\n");
        for(int i=0;i< board.length;i++){
            System.out.println("\t");
            for(int j=0;j< board[i].length;j++){
                System.out.print(board[i][j]+"\t\t");
            }
            System.out.println("\n");
        }
    }



    //  Task 4    Write a function that lets the user choose a spot
    //  Function name askUser()
    //  @param board (char[] [] board)
    //  @return spot (int[])
    //  Inside the function
    //      1. Asks the user: pick a row and column number:
    //      2. Check if the spot is taken. If so, let the user choose again.
    //      3. Return the row and column in an int[] array.
    public static int[] askUser(char[][] board ) {
        System.out.print("input row and column: ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        while (board[row][element] == 'X' || board[row][element] == 'X'){
            System.out.println("Spot taken,try again!\nInput row and column:");
            row = scan.nextInt();
            element = scan.nextInt();
        }
        return new int[]{row, element};
    }
    //  Task 6
    //  Write a function that determines the winner
    // Function name - checkWin()
        // * @param board (char[] [])
        //* @return count (int)
        //* Inside the function:
        //  1. Make a count variable that starts at 0.
        //  2. Check every row for a straight X or straight 0 (Task 7).
        //  3. Check every column for a straight X or straight 0 (Task 8).
        //  4. Check the left diagonal for a straight X or straight 0 (Task 9).
        //  5. Check the right diagonal for a straight X or straight 0 (Task 10).

    public static int checkWin(char[][] board){
        int count = 0;

        //x x x
        //o o o
        //o o o
        for(int i=0;i<board.length; i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == 'X'){
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }
                if(count == 3 || count == -3){
                    return count;
                }else{
                    count = 0;
                }
            }
        }

        //x o o
        //x o o
        //x o o
        for(int i=0;i<3;i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[j][i] == 'X'){
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if(count == 3 || count == -3){
                return count;
            }else{
                count = 0;
            }
        }

        //x o o
        //o x o
        //o o x
        for(int i=0;i<3; i++){

                if(board[i][i] == 'X'){
                    count++;
                } else if (board[i][i] == 'O') {
                    count--;
                }
                if(count == 3 || count == -3){
                    return count;
                }else{
                    count = 0;
                }

        }

        //o o x
        //o x o
        //x o o
        for(int i=0;i<3; i++){
            int rowIndex = 2-i;
            if(board[rowIndex][i] == 'X'){
                count++;
            } else if (board[rowIndex][i] == 'O') {
                count--;
            }
        }


        return count;
    }

}
