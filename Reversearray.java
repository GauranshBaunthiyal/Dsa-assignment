import java.util.*;

public class Reversearray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Input the size of array
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        //Input the array
        int arr[]= new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        //Initialize the pointers
        int left= 0;
        int right= arr.length-1;
        // Reverse the array by swapping elements
        while( left < right ){
            //Swapping the elements
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            //Move both the pointers towards the center
            left++;
            right--;
        }
        //Printing the reversed array
        System.out.println("The reversed array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    
}
