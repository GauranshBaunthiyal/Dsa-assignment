import java.util.*;

public class MatrixAddition {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    //Enter the number of rows and columns
    System.out.println("Enter the number of rows and columns");
    int m= sc.nextInt();
    int n= sc.nextInt();
    //Input first matrix
    int matrix1[][]= new int[m][n];
    System.out.println("Enter the first matrix");
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            matrix1[i][j]= sc.nextInt();
        }
    }
    //Input second matrix
    int matrix2[][]= new int[m][n];
    System.out.println("Enter the second matrix");
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            matrix2[i][j]= sc.nextInt();
        }
    }
    //Resultant matrix
    int sum[][]= new int[m][n];
    // Adding the corresponding elements of the matrices
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            sum[i][j]= matrix1[i][j] + matrix2[i][j];
        }
    }
    //Printing the result
    System.out.println("Resultant matrix:");
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(sum[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
    sc.close();
}
}