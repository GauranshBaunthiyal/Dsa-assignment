import java.util.*;

public class BoundaryToCenterMatrixWalk {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int r= sc.nextInt();
        int c= sc.nextInt();
        //Input matrix
        int matrix[][]= new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        //Initializing pointers
        int top=0;
        int bottom= r-1;
        int left= 0;
        int right= c-1;
        //Printing the numbers
        while(top <= bottom && left<= right){
            //Top row
            for(int i=left; i<=right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            //Right column
            for(int i= top; i<=bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            //Bottom row
            if( top<=bottom ){
                for(int i=right; i>=left; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            //Left column 
            if( left<=right ){
                for(int i=bottom; i>=top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
                }
            }
        System.out.println();
        sc.close();
        }
    }

