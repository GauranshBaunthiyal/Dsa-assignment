import java.util.*;

public class ArrayRotation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Enter the size of array
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        //Enter the array
        System.out.println("Enter the array");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //Enter the value of k
        System.out.println("Enter the value of k");
        int k= sc.nextInt();
        int start= 0;
        int end= n-1;
        k= k % n;
        //Reverse the entire array
        reverse(arr, 0, n-1);
        //Reverse the first k elements 
        reverse(arr, 0, k-1);
        //Reverse the remaining elements
        reverse(arr, k, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    public static void reverse(int arr[], int start, int end){
        while(start< end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
