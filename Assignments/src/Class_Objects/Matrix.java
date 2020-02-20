package Class_Objects;

import java.util.Scanner;

/**
 * Create a class called 'Matrix' containing constructor that
 * initializes the number of rows and number of columns of a
 * new Matrix object. The Matrix class has the following
 * information:
 * 1 - number of rows of matrix
 * 2 - number of columns of matrix
 * 3 - elements of matrix in the form of 2D array
 *
 *
 * The Matrix class has methods for each of the following:
 * 1 - get the number of rows
 * 2 - get the number of columns
 * 3 - set the elements of the matrix at given position (i,j)
 * 4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
 * 5 - multiplying the two matrices
 */

public class Matrix {
   private int No_of_Rows;
   private int No_of_Columns;
   int[][] Matrix = new int[No_of_Rows][No_of_Columns];


//Creating constructor for the matrix
   public Matrix(int Rows, int Columns){
        this.No_of_Rows = Rows;
        this.No_of_Columns = Columns;

    }

    //Loading the 2D Array
    public void Loading_Arrays() {
     int[][] Matrix = new int[No_of_Rows][No_of_Columns];
        Scanner sc = new Scanner(System.in);
        System.out.println(No_of_Rows);
        System.out.println(No_of_Columns);
        for (int i = 0; i < No_of_Rows; i++) {
            for (int j = 0; j < No_of_Columns; j++) {
                System.out.println("Enter the elements");
                Matrix[i][j] = sc.nextInt();
            }
        }


    }




/*Adding two matrices
        void Adding_Matrices(){
            int a; int b;
            int[][]Sum_of_Matrices = new int[No_of_Rows][No_of_Columns];
            int[][]Matrix1 = new int[No_of_Rows][No_of_Columns];
            int[][]Matrix2 = new int[No_of_Rows][No_of_Columns];
        for (a = 0 ; a > No_of_Rows ; a++){
            for (b = 0 ; b > No_of_Columns ; b++){
                Sum_of_Matrices[a][b] = Matrix1[a][b] + Matrix2[a][b];
            }
        }*/


}








