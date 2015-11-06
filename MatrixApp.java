package activity;

/**
 *
 * @author Eduardo Pulusan & Arvin Silvestre 
 * ACT - 2
 */
import java.util.*;
public class MatrixApp {
    public static void main (String [] args){
        Matrix A = new Matrix ();
        Matrix B = new Matrix ();
        Matrix Sum = new Matrix ();

        A.setCell(0, 0, 1);
        A.setCell(0, 1, 2);
        A.setCell(0, 2, 3);
        A.setCell(0, 3, 4);
        A.setCell(1, 0, 5);
        A.setCell(1, 1, 6);
        A.setCell(1, 2, 7);
        A.setCell(1, 3, 8);
        A.setCell(2, 0, 9);
        A.setCell(2, 1, 10);
        A.setCell(2, 2, 11);
        A.setCell(2, 3, 12);
        A.setCell(3, 0, 13);
        A.setCell(3, 1, 14);
        A.setCell(3, 2, 15);
        A.setCell(3, 3, 16);
       
        B.setCell(0, 0, 16);
        B.setCell(0, 1, 15);
        B.setCell(0, 2, 14);
        B.setCell(0, 3, 13);
        B.setCell(1, 0, 12);
        B.setCell(1, 1, 11);
        B.setCell(1, 2, 10);
        B.setCell(1, 3, 9);
        B.setCell(2, 0, 8);
        B.setCell(2, 1, 7);
        B.setCell(2, 2, 6);
        B.setCell(2, 3, 5);
        B.setCell(3, 0, 4);
        B.setCell(3, 1, 3);
        B.setCell(3, 2, 2);
        B.setCell(3, 3, 1);
        
        Sum.addMatrices(A, B);
        System.out.println ("-----------");
        Sum.displayMatrix();

    }
}
