/*
Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the 
out string, e.g. "<<word>>". Note: use str.substring(i, j) 
to extract the String starting at index i and going up to 
but not including index j.
 */
package codingbat;
import java.util.Scanner;

public class MakeOutWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char bracket;
        String skeleton, word;
        System.out.print("Enter a bracket: ");
        bracket = sc.next().charAt(0);
        System.out.print("Enter a word: ");
        word = sc.next();
        skeleton = createSkeleton(bracket);
        insert(skeleton, word);
    }
    
    public static String createSkeleton(char bracket){
        String skel;
        if(bracket == '(' || bracket == ')'){
            return skel = "(())";
        }
        if(bracket == '{' || bracket == '}'){
            return skel = "{{}}";
        }
        if(bracket == '[' || bracket == ']'){
            return skel = "[[]]";
        }
        if(bracket == '<' || bracket == '>'){
            return skel = "<<>>";
        }
        return "";
    }
    
    public static void insert(String skeleton, String word){
        String result="";
        for(int i = 0; i < 4; i++){
            if(i == 2){
                result = result + word;
            }
            result = result + skeleton.charAt(i);
        }
        System.out.println("Result: "+result);
    }
}