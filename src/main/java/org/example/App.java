package org.example;
import org.apache.commons.math3.fraction.BigFraction;
public class App {
    public static void main(String[] args) {
        // Esempio di tableau iniziale
        double[][] tableau = {
                {-7, -1, -1, 1, 0, 0,0,-6}, //
                {3, -1, 2, 0, 0, 1,0,4},
                {4,2,-1,-1,0,0,1,2},
                {1,0,1,0,1,0,0,2}
        };

        int enteringVariableIndex = 1;
        int leavingVariableIndex = 2;

        // Creare un'istanza della classe SimplexPivot
        SimplexPivot simplex = new SimplexPivot();

        // Convertire il tableau in frazioni
        BigFraction[][] fractionTableau = SimplexPivot.convertToFractionMatrix(tableau);

        // Esegui il pivoting
        BigFraction[][] newTableau = simplex.pivot(fractionTableau, leavingVariableIndex, enteringVariableIndex);

        // Stampa il nuovo tableau
        System.out.println("Nuovo tableau dopo il pivoting:");
        simplex.printTableau(newTableau);
    }
}

