/*
Given a string and a non-negative int n, we'll say that the 
front of the string is the first 3 chars, or whatever is there 
if the string is less than length 3. Return n copies of the front;
 */
package codingbat;
import java.util.*;

public class frontTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "", sub1 = "";
        int n;
        do{
            System.out.print("Enter a string of more than 3 characters: ");
            str = sc.next();
        }
        while(str.length() < 3);
        System.out.print("Enter number of repetitions: ");
        n = sc.nextInt();        
        String sub = str.substring(0,3);
        for(int i = 0; i<n; i++){
            sub1 = sub1+sub;
        }
        System.out.println("str: "+sub1);
    }
}