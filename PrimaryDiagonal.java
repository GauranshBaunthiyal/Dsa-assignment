import java.util.*;

public class PrimaryDiagonal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Enter the number of rows and columns
        System.out.println("Enter the number of rows and columns");
        int m= sc.nextInt();
        int n= sc.nextInt();
        //Input matrix
        int matrix[][]= new int[m][n];
        System.out.println("Enter the matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int sum=0;
        //Primary Diagonal sum 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sum+= matrix[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println();
        sc.close();
    }
}
