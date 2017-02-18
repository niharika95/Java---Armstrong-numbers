/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 */
package codingbat;
import java.util.*;

public class FirstHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="x";
        while(str.length() % 2 != 0){
            System.out.print("Enter an even length-ed string: ");
            str = sc.nextLine();
            if(str.length() % 2 != 0){
                System.out.println("Don't enter an odd length-ed string!\n");
            }
        }
        System.out.print("Result: ");
        for(int i = 0; i < str.length()/2; i++){
            System.out.print(str.charAt(i));
        }
    }
}