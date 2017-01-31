// Palindrome
package codingbat;
import java.util.Scanner;
public class Palindrome {
    public static void checkPalindrome(String orgStr){
        String revStr = orgStr;
        String temp = "";
        int len = orgStr.length();
        if(len == 1 || len == 0){
        }
        else{
            for(int i = len-1; i >= 0; i-- ){
                temp = temp + orgStr.charAt(i);
            }
            revStr = temp;            
            if(revStr.equals(orgStr)){
                System.out.println("The string is a Palindrome!");
            }
            else{
                System.out.println("The string is NOT a Palindrome!");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a palindrome!");
        String orgStr = sc.nextLine();
        checkPalindrome(orgStr);
    }
    
}
