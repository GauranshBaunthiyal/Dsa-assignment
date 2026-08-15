import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Input the size of the array
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        //Enter the array
        int arr[]= new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int count=0;
        //Prefix sum zero occurs once before starting
        map.put(0,1);
        for(int i=0; i<n; i++){
            sum+= arr[i];
            if(map.containsKey(sum)){
                count+= map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("The number of zero sum subarrays are: " + count);
        System.out.println();
        sc.close();
    }
}
