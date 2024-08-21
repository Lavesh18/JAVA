package backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void saveBoard(char[][] board,List<List<String>> allBoards)
    {
        String row=""; // single row

        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++)
        {
            row="";
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] == 'Q')
                {
                    row+='Q';
                }
                else
                {
                    row+='.';
                }
            }
            newBoard.add(row); //pick all rows and add to newBoard
        }
        allBoards.add(newBoard);// total newBoard to allBoards

    }
    public static boolean isSafe(int row,int col,char[][] board)
    {
         //now we have to check all the 8 directions like horizontal , vertical , upper left , upper right , lower left , lower right

        //horizontal we have to go each columns 

        for(int j=0;j<board.length;j++)
        {
            if(board[row][j] == 'Q')
            {
                return false;
            }
        }
             //vertical we have to go each rows
        for(int i=0;i<board[0].length;i++){
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        //upper left
        //for this we know row and col so [row-1][col-1]
        int r = row;
        for(int c=col; c>=0 && r>=0;c--,r--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        //upper right
        //for thsi we know row and col so [row-1][col-1]
         r=row;

        for(int c=col;c<board.length && r>=0;r--,c++)
        {
             if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        //lower left
        //for this [row+1][col-1]
        r=row;
        for(int c=col;r<board[0].length && c>=0;r++,c--)
        {
             if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        //lower right
        // for this [row+1][col+1]
        r=row;
        for(int c=col;c<board.length && r<board.length;c++,r++)
        {
             if(board[r][c] == 'Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void placement (List<List<String>> allBoards , char[][] board , int col)
    {
        //base case
        if(col == board.length)
        {
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(isSafe(row,col,board))
            {
                board[row][col] = 'Q';
                placement(allBoards, board, col+1); // going to next column and checking
                board[row][col] = '.'; // backtracking
            }
            
        }
    }
 public static void main(String[] args) {
   
    //we have n*n chess board and n queens
    //now place all the queens in such a way that all are save
    //give all possible ways
    //we will do column wise placing if 1 placed then do other then other if any of not safe then again backtrack 

    //so now suppose whereever a queen is put Q else .

    // so for 4*4

    // ans will be [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]] => total ways are length of array
    int n =4;
    List<List<String>> allBoards = new ArrayList<>();
    char[][] board = new char[n][n];
    placement(allBoards, board, 0);
    // System.out.println(allBoards.size()); //if want to print ways
    System.out.println(allBoards); // if want to print solution

 }   
}
