/*
Given a string, return a new string made of every other
char starting with the first, so "Hello" yields "Hlo".
 */
package codingbat;
import java.util.*;

public class stringBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2 = "";
        System.out.println("Enter a string: ");
        s1 = sc.nextLine();
        System.out.println("length: "+s1.length());
        if(s1.length() % 2 == 0){
            for(int i = 0; i < s1.length(); i += 2){
                s2 = s2 + s1.charAt(i);
            }
        }
        else{
            for(int i = 0; i < s1.length(); i += 2){
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println("Result: "+s2);
    }
}