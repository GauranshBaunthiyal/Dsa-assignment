import java.util.*;


public class LinearSearch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Input the size of the array
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        //Input the array
        System.out.println("Enter the array");
        int arr[]= new int[n];
        for(int i=0; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        //Input the integer to be searched
        System.out.println("Enter the key to be searched");
        int k= sc.nextInt();
        int comp=0;
        boolean found= false;
        for(int i=0; i<n ; i++){
            //Increment the comparison count 
            comp++;
            if( arr[i] == k ){
                System.out.println("Found at index: " + i );
                found= true;
                break;
            }
        }
        //If the key is not found in the array
        if(!found){
            System.out.println("Not Found");
        }
        System.out.println("Comparisons = " + comp );
        sc.close();
    }
    
}
