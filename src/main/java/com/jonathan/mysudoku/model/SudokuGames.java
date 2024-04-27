package com.jonathan.mysudoku.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that contains and returns the sudoku games.
 * @author Jonathan Aristizabal
 * @version 1.0
 */
public class SudokuGames {
    /**
     * A list containing pre-defined Sudoku game boards.
     */
    private final List<int[][]> gamesList=new ArrayList<>();
    /**
     * Int value to get the same game or a new one. Use 1 to get a new game or 0 to get the same game.
     */
    private int counter;
    /**
     * Int value to get the game.
     */
    private static int gameSelection=0;

    /**
     * Constructor that initializes the `gamesList` with pre-defined Sudoku game boards.
     * @param counter Int value to get a new game or the same game.
     */
    public SudokuGames(int counter){
        this.counter=counter;
        int[][] game1 = {
                {0, 1, 4, 0, 5, 0, 0, 3, 0},
                {9, 0, 0, 8, 0, 0, 0, 5, 1},
                {0, 7, 0, 4, 0, 3, 0, 2, 0},

                {7, 0, 8, 2, 0, 5, 0, 1, 0},
                {0, 0, 0, 7, 0, 1, 2, 0, 3},
                {6, 0, 1, 0, 0, 0, 5, 0, 0},

                {0, 0, 0, 0, 2, 0, 0, 4, 8},
                {1, 0, 0, 5, 0, 0, 3, 0, 0},
                {4, 8, 2, 0, 3, 7, 0, 0, 5}
        };
        gamesList.add(game1);
        int[][] game2 = {
                {0, 3, 0, 4, 0, 7, 0, 2, 5},
                {2, 4, 0, 1, 0, 0, 0, 3, 0},
                {0, 7, 0, 0, 2, 0, 6, 0, 0},

                {0, 5, 3, 7, 0, 2, 0, 0, 6},
                {0, 0, 0, 6, 0, 1, 0, 8, 0},
                {0, 2, 1, 0, 0, 0, 0, 7, 3},

                {0, 0, 0, 2, 0, 5, 7, 0, 0},
                {4, 1, 2, 0, 0, 0, 3, 0, 0},
                {0, 0, 7, 3, 0, 4, 2, 6, 0}
        };
        gamesList.add(game2);
        int[][] game3 = {
                {0, 0, 9, 0, 3, 2, 0, 7, 0},
                {3, 0, 0, 0, 0, 0, 1, 0, 8},
                {0, 4, 7, 5, 0, 8, 0, 9, 0},

                {0, 0, 4, 2, 0, 0, 0, 0, 0},
                {7, 0, 8, 0, 0, 0, 0, 2, 9},
                {2, 0, 0, 8, 1, 9, 0, 4, 5},

                {0, 0, 2, 0, 4, 0, 8, 0, 6},
                {4, 0, 0, 0, 8, 0, 9, 0, 2},
                {8, 9, 0, 3, 2, 0, 0, 0, 0}
        };
        gamesList.add(game3);
        int[][] game4 = {
                {0, 0, 2, 4, 0, 3, 0, 0, 0},
                {9, 0, 8, 0, 2, 0, 0, 0, 7},
                {0, 0, 3, 8, 0, 0, 5, 2, 9},

                {6, 9, 7, 0, 4, 5, 1, 8, 0},
                {0, 2, 0, 9, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 3, 0, 2, 9, 0},

                {7, 3, 0, 0, 8, 4, 6, 5, 0},
                {0, 0, 0, 0, 0, 0, 3, 0, 0},
                {8, 5, 0, 3, 6, 0, 0, 0, 4}
        };
        gamesList.add(game4);
    }

    /**
     * This method retrieves a sudoku board depending on the counter value.
     * @return A 2D integer array representing the selected Sudoku game board.
     */
    public int[][] getGame(){
        gameSelection+=counter;
        if(gameSelection>3){gameSelection=0;}
        return gamesList.get(gameSelection);
    }

}

        /*
         int [][] game1= {
                {2,1,4,9,5,6,8,3,7},
                {9,6,3,8,7,2,4,5,1},
                {8,7,5,4,1,3,9,2,6},
                {7,3,8,2,4,5,6,1,9},
                {5,4,9,7,6,1,2,8,3},
                {6,2,1,3,9,8,5,7,4},
                {3,5,6,1,2,9,7,4,8},
                {1,9,7,5,8,4,3,6,2},
                {4,8,2,6,3,7,1,9,5}
        };
        int [][] game2= {
                {1,3,6,4,9,7,8,2,5},
                {2,4,5,1,6,8,9,3,7},
                {9,7,8,5,2,3,6,1,4},
                {8,5,3,7,4,2,1,9,6},
                {7,9,4,6,3,1,5,8,2},
                {6,2,1,8,5,9,4,7,3},
                {3,6,9,2,8,5,7,4,1},
                {4,1,2,9,7,6,3,5,8},
                {5,8,7,3,1,4,2,6,9}
        };
        int [][] game3= {
                {6,8,9,1,3,2,5,7,4},
                {3,2,5,7,9,4,1,6,8},
                {1,4,7,5,6,8,2,9,3},
                {9,5,4,2,7,6,3,8,1},
                {7,1,8,4,5,3,6,2,9},
                {2,6,3,8,1,9,7,4,5},
                {5,3,2,9,4,7,8,1,6},
                {4,7,1,6,8,5,9,3,2},
                {8,9,6,3,2,1,4,5,7}
        };
        int [][] game4= {
                {5,7,2,4,9,3,8,6,1},
                {9,1,8,5,2,6,4,3,7},
                {4,6,3,8,7,1,5,2,9},
                {6,9,7,2,4,5,1,8,3},
                {3,2,5,9,1,8,7,4,6},
                {1,8,4,6,3,7,2,9,5},
                {7,3,9,1,8,4,6,5,2},
                {2,4,6,7,5,9,3,1,8},
                {8,5,1,3,6,2,9,7,4}
        };
        */
