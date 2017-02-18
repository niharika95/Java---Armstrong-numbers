/*
Given a string, return a string made of the chars at 
indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 */
package codingbat;
import java.util.Scanner;

public class AltPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String og;
        boolean flag;
        System.out.println("Enter a String: ");
        og = sc.nextLine();
        if (og.length()%2 != 0) {
            og+="*";
        }
        String answer = "";
         flag = true;
        for (int i = 0; i < og.length(); i+=4) {
                answer += og.charAt(i);
                answer += og.charAt(i+1);
        }
        System.out.println("Result : "+answer);
    }
}