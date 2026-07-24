import java.util.*;

public class Delete {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Input the size of array
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        //Input the array
        System.out.println("Enter the array");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //Input the position of the element to be deleted
        System.out.println("Enter the position of the element to be deleted");
        int pos= sc.nextInt();
        //Shift the elements to the left
        for(int i= pos-1; i<n-1; i++){
            arr[i]= arr[i+1];
        }
        //Printing the array
        System.out.println("The array is: ");
        for(int i=0; i<n-1; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sc.close();
        }
    }

