/*
Given 2 strings, a and b, return the number of the positions 
where they contain the same length 2 substring. So "xxcaazz" 
and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings 
appear in the same place in both strings.
 */
package codingbat;
import java.util.Scanner;

public class StringMatch {
    static int len;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.print("Enter string 1: ");
        str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        str2 = sc.nextLine();
        if(str1.length() > str2.length()){
            len = str2.length();
        }
        else{
            len = str1.length();
        }
        checkMatch(str1, str2);
    }
    
    public static void checkMatch(String str1, String str2){
        int count = 0;
        for(int i = 0; i < len-1; i++){
            if(str1.charAt(i) == str2.charAt(i)){
                if(str1.charAt(i+1) == str2.charAt(i+1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}