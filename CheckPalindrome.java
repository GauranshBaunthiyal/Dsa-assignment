import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Input the string
        System.out.println("Enter the string ");
        String str= sc.nextLine();
        //Initialize the pointers
        int left= 0;
        int right= str.length() - 1;
        boolean isPalindrome = true;
        //Compare the characters from both the ends
        while(left<right){
            if( str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        //Printing the result
        if(isPalindrome){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        System.out.println();
        sc.close();
    }
    
}
