package activity;

/**
 *
 * @author Eduardo Pulusan & Arvin Silvestre ACT-2
 */
public class Matrix {
    private int SIZE = 4;
    private int [][] squares = new int [SIZE][SIZE];
    public Matrix () {};
    public void addMatrices(Matrix a, Matrix b){
        int x , y;
        for (x = 0; x < SIZE; x++){
            for (y = 0; y < SIZE; y++){
                squares[x][y] = a.getCell(x, y) + b.getCell(x, y);
            }
        }
    }
    public void setCell(int x, int y, int value){
        squares[x][y] = value;
    }
    public int getCell(int x, int y){
        return this.squares[x][y];
    }
    public void displayMatrix(){
        int x , y;
        for (x = 0; x < SIZE; x++){
            for (y = 0; y < SIZE; y++){
                showCell(x, y);
            }
            System.out.println("");
        }
    }
    public void showCell (int x, int y){
        System.out.print (squares[x][y] + " ");
    }
}
