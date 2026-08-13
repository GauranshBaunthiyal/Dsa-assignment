import java.util.*;

public class PairSumClosestToZero {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Enter the size of the array
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        //Enter the array
        int arr[]= new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //Sort the array
        Arrays.sort(arr);
        //Initialize the pointers
        int left= 0;
        int right= n-1;
        int minDiff= Integer.MAX_VALUE;
        int result_1= 0;
        int result_2= 0;
        while( left < right ){
            int sum= arr[left] + arr[right];
            if( Math.abs(sum) < minDiff ){
                minDiff= Math.abs(sum);
                result_1= arr[left];
                result_2= arr[right];
            }
            if(sum < 0 ){
                left++;
            }
            else if(sum > 0 ){
                right--;
            }
            else{
                break;
            }
        }
        System.out.println( result_1 + " " + result_2);
        System.out.println();
        sc.close();
    }
}
