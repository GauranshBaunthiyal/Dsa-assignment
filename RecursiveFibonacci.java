import java.util.*;

public class RecursiveFibonacci {

    //Function to find the nth fibonacci number
    public static int fib(int n){

        //Base case
        if(n==0 || n==1){
            return n;
        }

        //Recursive case
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //Input the number
        System.out.println("Enter the number");
        int n= sc.nextInt();

        //Printing the fibonacci number
        System.out.println("The " + n + " th Fibonacci number is: " + fib(n));
        System.out.println();
        sc.close();
    }
    
}
