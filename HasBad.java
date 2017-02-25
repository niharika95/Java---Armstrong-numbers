/*
Given a string, return true if "bad" appears starting at index 0 or
1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 */
package codingbat;
import java.util.Scanner;

public class HasBad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, ss1, ss2;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        ss1 = str.substring(0,3);
        ss2 = str.substring(1,4);
        if(ss1.equals("bad") || ss2.equals("bad")){
            System.out.println("It has bad!");
        }
        else{
            System.out.println("It does not have bad!");
        }
    }
}