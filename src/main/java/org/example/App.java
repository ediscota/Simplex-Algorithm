package org.example;
import org.apache.commons.math3.fraction.BigFraction;
public class App {
    public static void main(String[] args) {
        // Esempio di tableau iniziale con numeri frazionari
        BigFraction[][] tableau = {
                {new BigFraction(0), new BigFraction(0), new BigFraction(-16, 5), new BigFraction(2), new BigFraction(1,5),new BigFraction(-10)},
                {new BigFraction(1), new BigFraction(0), new BigFraction(-23,5), new BigFraction(-1), new BigFraction(-2,5), new BigFraction(2)},
                {new BigFraction(0), new BigFraction(1), new BigFraction(4,5), new BigFraction(0), new BigFraction(1,5), new BigFraction(2)}

        };

        int enteringVariableIndex =2;
        int leavingVariableIndex = 2;

        // Creare un'istanza della classe SimplexPivot
        SimplexPivot simplex = new SimplexPivot();

        // Esegui il pivoting
        BigFraction[][] newTableau = simplex.pivot(tableau, leavingVariableIndex, enteringVariableIndex);

        // Stampa il nuovo tableau
        System.out.println("Nuovo tableau dopo il pivoting:");
        simplex.printTableau(newTableau);
    }
}


