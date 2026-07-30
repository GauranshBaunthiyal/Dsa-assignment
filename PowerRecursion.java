import java.util.*;

public class PowerRecursion {
    //Function to find a raise to the power b
    public static int power(int a, int b){
        //Base case
        if( b == 0 ){
            return 1;
        }
        //Recursive case
        return a * power(a, b-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input a 
        System.out.println("Enter the value of a");
        int a= sc.nextInt();
        //Input b
        System.out.println("Enter the value of b");
        int b= sc.nextInt();
        //Printing the answer
        System.out.println(a + " Raised to the power " + b + " is: " + power(a,b));
        System.out.println();
        sc.close();
    }
}
