import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Input the size of the array
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        //Input the array
        System.out.println("Enter the array");
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //Initialize the pointers
        int i=0;
        //Compare the elements
        for(int j=1; j<n; j++){
            //If the current element is different, it is unique
            if(arr[j] != arr[i]){
                i++;
                arr[i]= arr[j];
            }
        }
        //Printing the unique elements
        System.out.println("The unique elements are: ");
        for(int x=0; x<=i; x++){
            System.out.print(arr[x] + " ");
        }
        System.err.println();
        sc.close();
    }
    
}
