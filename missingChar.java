/*
Given a non-empty string and an int n, return a new string where the 
char at index n has been removed. The value of n will be a valid index 
of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 */
package codingbat;
import java.util.*;

public class missingChar {
    public static void main(String[] args) {
        String wordInput;
        int indexInput = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        wordInput = sc.nextLine();
        while(count == 0){
            System.out.print("Enter the index number: ");
            indexInput = sc.nextInt();
            if(indexInput > wordInput.length()){
                System.out.println("Enter a valid index number!");
                count = 0;
            }
            else{
                count++;
            }
        }
        change(wordInput, indexInput);
    }
    
    public static void change(String wordInput, int indexInput){
        StringBuilder result = new StringBuilder(wordInput);
        result.deleteCharAt(indexInput);
        System.out.println("Result: "+ result);
    }
}