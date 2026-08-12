import java.util.*;

public class ArrayMaxMin {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Enter the size of the array
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        //Enter the array
        System.out.println("Enter the array");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int max= arr[0];
        int min= arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]> max){
                max= arr[i];
            }
            if(arr[i]< min){
                min= arr[i];
            }
        }
        //Printing the result
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println();
        sc.close();
    }
    
}
