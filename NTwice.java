/*
Given a string and an int n, return a string made of the first and
last n chars from the string. The string length will be at least n.
 */
package codingbat;
import java.util.Scanner;

public class NTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, temp1, temp2, res;
        int n;
        System.out.print("Enter a string:");
        str = sc.nextLine();
        System.out.print("Enter an integer:");
        n = sc.nextInt();
        temp1 = str.substring(0,n);
        temp2 = str.substring(str.length()-n, str.length());
        res = temp1 + temp2;
        System.out.println("Resut: " + res);
    }
}