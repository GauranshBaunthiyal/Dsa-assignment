import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Input the size of the array
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        //Input the array
        System.out.println("Enter the array");
        int arr[]= new int[n+1];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the position where the element is to be inserted");
        int pos= sc.nextInt();
        //Input the element to be inserted
        System.out.println("Enter the element to be inserted");
        int x= sc.nextInt();
        //Shift elements to the right
        for(int i=n; i>=pos; i--){
            arr[i]= arr[i-1];
        }
        //Insert the new element
        arr[pos-1]= x;
        //Printing the array
        System.out.println("The array is: ");
        for(int i=0; i<=n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sc.close();
    }
}