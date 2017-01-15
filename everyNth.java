/*
Given a non-empty string and an int N, return the string made starting 
with char 0, and then every Nth char of the string. So if N is 3, use 
char 0, 3, 6, ... and so on. N is 1 or more.
 */
package codingbat;
import java.util.*;

public class everyNth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        int n, limit;        
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        System.out.print("Enter the repeating index value: ");
        n = sc.nextInt();
        
        limit = (int) java.lang.Math.ceil((float) (str.length()/(float) n));
        
        StringBuilder result = new StringBuilder();        
        for(int i = 0; i < str.length(); i = i+n){
            result.append(str.charAt(i));
        }
        System.out.print("Result: "+ result);
    }
}