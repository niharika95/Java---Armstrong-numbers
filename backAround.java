/*
Given a string, take the last char and return a new string with the
last char added at the front and back, so "cat" yields "tcatt". The 
original string will be length 1 or more.

 */
package codingbat;
import java.util.Scanner;

public class backAround {
    public static void main(String[] args) {
        String wordInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        wordInput = sc.nextLine();
        char alph = wordInput.charAt(wordInput.length()-1);
        System.out.println("Result:\n" + alph + wordInput + alph);
    }
}