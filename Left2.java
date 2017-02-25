/*
Given a string, return a "rotated left 2" version where the first 
2 chars are moved to the end. The string length will be at least 2.
 */
package codingbat;
import java.util.Scanner;

public class Left2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str = sc.nextLine();
        String temp = str.substring(0, 2);
        StringBuilder sb = new StringBuilder(str);
        sb.delete(0, 2);
        sb.append(temp);
        System.out.println("Result: "+sb);
    }
}