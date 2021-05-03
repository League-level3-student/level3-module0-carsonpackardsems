package _03_Intro_to_2D_Arrays;

public class _02_RowColumnSum {

    public int getSumByRow(int[][] matrix, int row) {
    	int sumOfRow;
    	int[] inputsR = {0,1,2} ;
        for(int i = 0; i < 3; i++) {
        	inputsR[i] = matrix[row][i];
        }
        sumOfRow = inputsR[0] + inputsR[1] + inputsR[2];
        return sumOfRow;
    }
    
    public int getSumByColumn(int[][] matrix, int col) {
    	int sumOfColumn;
    	int[] inputsC = {0,1,2} ;
    	for(int i = 0; i < 3; i++) {
        	inputsC[i] = matrix[i][col];
        }
        sumOfColumn = inputsC[0] + inputsC[1] + inputsC[2];
        return sumOfColumn;
    }
    }

