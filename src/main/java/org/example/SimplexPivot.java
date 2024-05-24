package org.example;
import org.apache.commons.math3.fraction.BigFraction;

public class SimplexPivot {

    public BigFraction[][] pivot(BigFraction[][] tableau, int row, int col) {
        int numRows = tableau.length;
        int numCols = tableau[0].length;
        BigFraction[][] newTableau = new BigFraction[numRows][numCols];

        // Step 1: Dividere la riga pivot per l'elemento pivot
        BigFraction pivotElement = tableau[row][col];
        for (int j = 0; j < numCols; j++) {
            newTableau[row][j] = tableau[row][j].divide(pivotElement);
        }

        // Step 2: Aggiornare le altre righe
        for (int i = 0; i < numRows; i++) {
            if (i != row) {
                BigFraction multiplier = tableau[i][col];
                for (int j = 0; j < numCols; j++) {
                    newTableau[i][j] = tableau[i][j].subtract(multiplier.multiply(newTableau[row][j]));
                }
            }
        }

        return newTableau;
    }

    public void printTableau(BigFraction[][] tableau) {
        for (BigFraction[] row : tableau) {
            for (BigFraction value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static BigFraction[][] convertToFractionMatrix(double[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        BigFraction[][] fractionMatrix = new BigFraction[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                fractionMatrix[i][j] = new BigFraction(matrix[i][j]);
            }
        }

        return fractionMatrix;
    }
}
