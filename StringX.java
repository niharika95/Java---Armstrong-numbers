/*
Given a string, return a version where all the "x" 
have been removed. Except an "x" at the very start 
or end should not be removed.
 */
package codingbat;
import java.util.Scanner;

public class StringX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < sb.length()-1; i++) {
            char temp = sb.charAt(i);
            if (sb.charAt(i) == 'x') {                
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("Result: "+sb);
    }
}