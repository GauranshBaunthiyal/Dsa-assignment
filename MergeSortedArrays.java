import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int p= sc.nextInt();
        //Input the first array
        System.out.println("Enter the first array");
        int arr1[]= new int[p];
        for(int i=0; i<p; i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the size of second array");
        int q= sc.nextInt();
        //Input the second array
        System.out.println("Enter the second array");
        int arr2[]= new int[q];
        for(int j=0; j<q; j++){
            arr2[j]= sc.nextInt();
        }
        //Create a merged array
        int merged[]= new int[p+q];
        //Initialize the pointers
        int i=0;
        int j=0;
        int k=0;
        //Compare the elements of both the arrays
        while(i<p && j<q){
            if( arr1[i] <= arr2[j] ){
                merged[k]= arr1[i];
                i++;
            }
            else{
                merged[k]= arr2[j];
                j++;
            }
            k++;
        }
        //Copy the remaining elements of first array
        while( i < p ){
            merged[k]= arr1[i];
            i++;
            k++;
        }
         //Copy the remaining elements of second array
         while( j < q ){
            merged[k]= arr2[j];
            j++;
            k++;
        }

        //Print the merged array
        System.out.println("The merged array is: ");
        for(int x=0; x<merged.length; x++){
            System.out.print(merged[x] + " ");
        }
        System.out.println();
        sc.close();
    }
    
}
