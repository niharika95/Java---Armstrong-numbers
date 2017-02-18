/*
Count the number of "xx" in the given string. We'll 
say that overlapping is allowed, so "xxx" contains 2 "xx".
 */
package codingbat;
import java.util.Scanner;

public class CountXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int flag = 0;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                flag++;
            }
        }
        System.out.println("There are "+flag+" xx's in the string.");
    }
}