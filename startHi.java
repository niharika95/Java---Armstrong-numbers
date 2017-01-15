/*
Given a string, return true if the string starts with "hi" and false otherwise.
 */
package codingbat;
import java.util.Scanner;

public class startHi {
    static String input;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        input = sc.nextLine();
        System.out.println (checkHi(input));
    }
    
    public static boolean checkHi(String input){
        //char a = input.charAt(0);
        if(input.charAt(0) == 'h'  || input.charAt(0) == 'H'){
            if(input.charAt(1) == 'i'){
                return true;
            }
        }
        return false;
    }
}