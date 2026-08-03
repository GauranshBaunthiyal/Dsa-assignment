import java.util.*;

public class SymmetricMatrix {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Enter the number of rows and columns
        System.out.println("Enter the number of rows and columns");
        int m= sc.nextInt();
        int n= sc.nextInt();
        //A symmetric matrix must be a square
        if(m != n){
            System.out.println("Not a symmetric matrix");
            sc.close();
            return;
        }
        //Input matrix
        int matrix[][]= new int[m][n];
        System.out.println("Enter the matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
                }
            }
        boolean isSymmetric = true;
        //Checking if the matrix is symmetric
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
            if(!isSymmetric){
                break;
            }
        }
        //Printing the result
        if(isSymmetric){
            System.out.println("Symmetric Matrix");
        }
        else{
            System.out.println("Not a symmetric matrix");
        }
    }
    }
    
