import java.util.*;

public class IdentityMatrix {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Enter the nummber of rows and columns
        System.out.println("Enter the number of rows and colums");
        int n= sc.nextInt();
        //Input matrix
        int matrix[][]= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        boolean isIdentity= true;
        //Check matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //Diagonal elements should be 1
                if(i==j && matrix[i][j]!= 1){
                    isIdentity= false;
                    break;
                }
                //Non-diagonal elements should be zero
                if(i!=j && matrix[i][j]!= 0){
                    isIdentity= false;
                    break;
                }
            }
            if(!isIdentity){
                break;
            }
        }
        //Printing the result
        if(isIdentity){
            System.out.println("Identity matrix");
        }
        else{
            System.out.println("Not an Identity matrix");
        }
        System.out.println();
        sc.close();
    } 
    
}
