import java.util.*;

public class FrequencyInArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Input the size of array
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        //Enter the array
        int arr[]= new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //Create a hashmap
        HashMap<Integer, Integer> freq= new HashMap<>();
        //Traverse the hashmap
        for(int i=0; i<n; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        //Printing the result
        for(int num: freq.keySet()){
            System.out.print(num + ":" + freq.get(num) + " ");
        }
    }
}
