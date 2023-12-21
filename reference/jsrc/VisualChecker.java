
// class for visually checking the instances

import java.util.ArrayList;

public class VisualChecker {
    
    public static void drawChess(BinaryCSP instance){
        ArrayList<Integer> sol = new ArrayList<Integer>();
        for(int i = 0; i < instance.getNoVariables(); i ++){
            sol.add(instance.getVarAssignment(i).getAsInt());
            
        }
        drawChess(sol);
    }
    public static void drawChess(ArrayList<Integer> sol){
        Boolean failed = false;
        // int size = instance.getNoVariables();
        // System.out.println("hello world");
        int size = sol.size();
        for(int i = 0; i < size; i ++){
            System.out.println("Var: " + i + " Val: " + sol.get(i));
            
        }
        

        // assume square
        String[][] board = new String[size][size];
        
        // fill with 0s first
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++){
                board[i][j] = "0";
            }
        }

        // populate queens 
        for(int queenRow = 0; queenRow < size; queenRow ++){
            // queen put on a space that is invalid
            int queenCol = sol.get(queenRow);
            if(board[queenRow][queenCol].equals("X")){
                failed = true;
            }

            board[queenRow][sol.get(queenRow)] = "Q";

           

            
            for(int row = 0; row < size; row ++){
                for (int col = 0; col < size; col ++){

                    // for all adjacent squares that are not precisely where the current queen is are checked and then excluded
                    // if there is a queen on one of these spaces, the checker fails
                    if ((row == queenRow && col != queenCol) || (col == queenCol && row != queenRow)){
                        if(board[row][col].equals("Q")){
                            failed = true;
                        }
                        board[row][col] = "X";
                    } 
                    // diagonals when row and col equal distance from Q
                    else if (Math.abs((queenRow - row)) == Math.abs(queenCol - col) && queenRow != row && queenCol != col){
                        if(board[row][col].equals("Q")){
                            failed = true;
                        }
                        board[row][col] = "X";
                    }
                }
            }



            // // print after each step just for testing
            // for(int i = 0; i < size; i ++){
            //     System.out.print("[ ");
            //     for(int j = 0; j < size; j ++){
            //         System.out.print(board[i][j]);
            //     }
            //     System.out.println(" ]");
            // }
            // System.out.println();


        }



        // print board
        for(int i = 0; i < size; i ++){
            System.out.print("[ ");
            for(int j = 0; j < size; j ++){
                System.out.print(board[i][j]);
            }
            System.out.println(" ]");
        }
        System.out.println();
    
        

        if(failed){
            System.out.println("Solution is invalid!");
        }
    }

    public static void drawSudoku(BinaryCSP instance){
        Boolean failed = false;

        int size = instance.getNoVariables();
        for(int i = 0; i < size; i ++){
            System.out.println("Var: " + i + " Val: " + instance.getVarAssignment(i).getAsInt());
            
        }


        Integer[][] board = new Integer[9][9];
        for(int row = 0; row < 9; row ++){
            for(int col = 0; col < 9; col ++){
                board[row][col] = instance.getVarAssignment((row*9) + col).getAsInt();
            }
        }

        // print board
        for(int i = 0; i < 9; i ++){
            System.out.print("[ ");
            for(int j = 0; j < 9; j ++){
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println(" ]");
        }
        System.out.println();


        // TODO add checks here but cba rn
    }

    public static void drawLangsfords(BinaryCSP instance){
        // TODO check distances 
        int size = instance.getNoVariables();
        for(int i = 0; i < size; i ++){
            System.out.println("Var: " + i + " Val: " + instance.getVarAssignment(i).getAsInt());
            
        }
    }
}
