package com.jonathan.mysudoku.model;
import java.util.HashSet;
import java.util.Set;

/**
 * Class representing the sudoku board and its game logic.
 * @author Jonathan Aristizabal
 * @version 1.0
 */
public class SudokuLogic {
    /**
     * int[][] matrix that will storage the game played by the user in the UI.
     */
    private int[][] sudokuCells;
    /**
     * Set that will storage the rows, columns and 3x3 sections and will check that the numbers are not repeated.
     */
    private Set<Integer> checkSet=new HashSet<>();

    /**
     * Constructor that takes a 2D integer array representing the current state of the Sudoku board.
     * @param matrix The 2D integer array representing the Sudoku board.
     */
    public SudokuLogic(int[][] matrix){
        sudokuCells=matrix;
    }

    /**
     * Method to check if the current state of the Sudoku board is valid according to the game rules.
     * @return An integer code representing the validation result:
     * - 1: Row validation failed (duplicate number found in a row).
     * - 2: Column validation failed (duplicate number found in a column).
     * - 3: The board is not complete (empty cells exist).
     * - 4: Section validation failed (duplicate number found in a 3x3 section).
     * - 5: The board is valid (no duplicate numbers in rows, columns or 3x3 sections).
     */
    public int checkGame(){
        int rowAux=0;
        int columnAux=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(sudokuCells[i][j]==0){return 3;}
            }
            checkSet.clear();
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                for (int k=0;k<3;k++){
                    for (int l=0;l<3;l++){
                        if(!checkSet.add(sudokuCells[k+rowAux][l+columnAux])){return 4;}
                    }
                }
                checkSet.clear();
                columnAux+=3;
            }
            rowAux+=3;
            columnAux=0;
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(!checkSet.add(sudokuCells[i][j])){return 1;}
            }
            checkSet.clear();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(!checkSet.add(sudokuCells[j][i])){return 2;}
            }
            checkSet.clear();
        }
        return 5;
    }
}
