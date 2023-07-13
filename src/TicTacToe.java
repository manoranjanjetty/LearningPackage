import java.util.Scanner;

public class TicTacToe {
    public static void main(String args){
    Rungame();
    }//end main

    public static void Rungame(){
    String winner ="";
    boolean XTurn = true;
    int theRow= 0;
    int theCol = 0;
    String[][] gameboard = new String[3][3];

    InitializeGame(gameboard);

    //Print initial board
        PrintCurrentboard(gameboard);

        //""Signal no winner
        while(winner.equals("")){
            if(XTurn){
                System.out.println("It is X's turn");
            }
            else{
                System.out.println("It's O's turn");
            }
            GetUserInput(XTurn, gameboard);
            System.out.println();

            PrintCurrentboard(gameboard);
            winner = Getwinner(gameboard);
            XTurn = !XTurn;

            if(winner.equals("") && IsboardFull(gameboard)){
                winner = "C";
            }//end if
        }//end while

        //cat's game
        System.out.println();

        if(winner.equals("C")){
            System.out.println("IT was the Cat's game! NO winner");
        }
        else{
            System.out.println("The Winner is " + winner);
        }
    }//end RunGame

    public static void InitializeGame(String[][] gameboard){
    for(int i=0; i<gameboard.length; i++){
        for(int j=0; j<gameboard[i].length; j++){
            gameboard[i][j] = " ";
        }//end for j
    }//end for i
    }//end Ingame

    public static void PrintCurrentboard(String[][] gameboard){
    for(int i=0; i<gameboard.length; i++){
        for(int j=0; j<gameboard[i].length; j++){
            System.out.println(gameboard[i][j]);
            if(j<2){
                System.out.print(" | ");
            }
        }//end for J
        System.out.println();
        if(i<2){
            System.out.print("- - - - -");
        }
        //to add some space between the board
        System.out.println();
    }//end for i
    }//end PCB

    public static void GetUserInput(boolean XTurn, String[][] gameboard){
    Scanner keyboard = new Scanner(System.in);
    int row = -1;
    int col = -1;
    boolean keepAsking = true;

    while(keepAsking){
        System.out.println("Please enter the row THEN " + "the column, each from 0,1 or 2, " + "seperated by a space");

        row = keyboard.nextInt();
        col = keyboard.nextInt();
        keyboard.nextLine();//consume new line

        //if we are bounds with Row and column
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2){
            //valid and in-range selection
            //but, is it occupied by an X or O already?
            if(!CellAlreadyOccupied(row,col, gameboard)){
                keepAsking = false ;
            }
            else{
                System.out.println("That cell is already occupied!");
            }//end if-else
        }//end if
    }//end while
        //by the time it get's here, we know it's a valid row and column
        //in range and not already occupied
        if(XTurn){
            gameboard[row][col] = "x";
        }
        else {
            gameboard[row][col] = "o";
        }
    }//end getUserInput

    public static boolean CellAlreadyOccupied(int row, int col, String[][] gameboard){

        return !gameboard[row][col].equals(" ");
    }//end CAO

    public static String Getwinner(String[][] gameboard){
    final int rows = gameboard.length;
    final int cols = gameboard[0].length;

    for(int i=0; i<rows; i++){
        if(!gameboard[i][0].equals(" ") && gameboard[i][0].equals(gameboard[i][1]) && gameboard[i][1].equals(gameboard[i][2])) {
            return gameboard[i][0];
        }//end if
    }//end for
        //check columns
        for(int i=0; i<cols; i++) {
            if (!gameboard[0][i].equals(" ") && gameboard[0][i].equals(gameboard[1][i]) && gameboard[1][i].equals(gameboard[2][i])) {
                return gameboard[0][i];
            }
        }//end for
        //check diagonals
        //There are 2 diagonals which we can test manually / no loop
        //upper-left to bottom right diagonal
        if (!gameboard[0][0].equals(" ") && gameboard[0][0].equals(gameboard[1][1]) && gameboard[1][1].equals(gameboard[2][2])) {
            return gameboard[0][0];//we have a diagonal match!
        }
        //lower left to upper right diagonal
        if (!gameboard[2][0].equals(" ") && gameboard[2][0].equals(gameboard[1][1]) && gameboard[1][1].equals(gameboard[0][2])) {
            return gameboard[2][0];//we have a diagonal match!
        }
        //if we get to here...
        return ""; //no winner yet
    }//end getwinner

    public static boolean IsboardFull(String[][] gameboard){
int countFill = 0;

for(int i=0; i<gameboard.length; i++){
    for(int j=0; j< gameboard[i].length; j++){
        if(!gameboard[i][j].equals(" ")){
            countFill++;
        }
    }//end for J
}//end for I
        return countFill == 9;
    }//end IBF
}//end class
