/*
Given a string and a second "word" string, we'll say that the word matches 
the string if it appears at the front of the string, except its first char 
does not need to match exactly. On a match, return the front of the string, 
or otherwise return the empty string. So, so with the string "hippo" the word 
"hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
 */
package codingbat;
import java.util.Scanner;

public class StartWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String master="", word="x", res="";
        System.out.println("The master string should be greater than the word string.\n");
        while(master.length() < word.length()){
            System.out.println("Enter the master string: ");
            master = sc.nextLine();
            System.out.println("Enter the word string (Make sure it is smaller than the master string): ");
            word = sc.nextLine();
        }
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == master.charAt(i)){
                res = res + word.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println("Result: " + word.charAt(0) + res);
    }
}