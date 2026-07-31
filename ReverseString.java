import java.util.*;

public class ReverseString {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    //Input code name
    System.out.println("Enter the string");
    String str= sc.nextLine();
    //Printing  the transformed string
    for(int i= str.length() -1; i>=0; i--){
        System.out.print(str.charAt(i));
    }
    System.out.println();
    sc.close();
}

}
