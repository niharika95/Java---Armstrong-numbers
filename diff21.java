/*
Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21.
 */
package codingbat;
import java.util.*;

public class diff21 {
    public static void main(String[] args) {
        int input, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        input = sc.nextInt();
        System.out.println("Result : " + checkDiff(input));
    }
    
    public static int checkDiff(int input){
        if (input <= 21){
            return (21-input);
        }
        else{
            return (2*(input-21));
        }
    }
}