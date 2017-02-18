/*
Given a string and a non-negative int n, return a larger 
string that is n copies of the original string.
 */
package codingbat;
import java.util.*;

public class stringTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int n;
        StringBuilder result = new StringBuilder();
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            result = result.append(str);
        }
        System.out.println("Result: "+ result);
    }
}