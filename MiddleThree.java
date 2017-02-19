/*
Given a string of odd length, return the string length 3 from its middle,
so "Candy" yields "and". The string length will be at least 3.
 */
package codingbat;
import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="";
        int middle;
        while(str.length() % 2 == 0){
            System.out.println("Enter a string of odd length and length more than three: ");
            str = sc.nextLine();
            if(str.length() % 2 == 0 || str.length() < 3){
                System.out.println("String of EVEN LENGTH and LENGTH LESS THAN 3 is NOT ALLOWED.\n");
            }      
        }
        middle = str.length() / 2;
        System.out.println("Result: " + str.charAt(middle-1) + str.charAt(middle) + str.charAt(middle+1));       
    }
}