import java.util.Scanner;

public class SumofTwoNos {
    public static void main(String[] args) {

    int No_of_Rows = 2;
    int No_of_Columns = 2;

    int[][] Ar1 = new int[No_of_Rows][No_of_Columns];
    int[][] Ar2 = new int[No_of_Rows][No_of_Columns];

     int i; int j;
        for (i = 0 ; i < No_of_Rows ; i++){
        for (j = 0; j < No_of_Columns ; j++){

            System.out.println("Enter the input");
            Scanner sc = new Scanner(System.in);
            Ar1[i][j] = sc.nextInt();
            Ar2[i][j] = sc.nextInt();
        }
            //System.out.println(Ar[i][j])sdsd;
    }

        for (i = 0; i < No_of_Rows ; i++){
            for (j = 0; j<No_of_Columns; j++){
                int[][] Sum = new int[No_of_Rows][No_of_Columns];
                Sum[i][j] = Ar1[i][j] + Ar2[i][j];
            }
        }
}}



