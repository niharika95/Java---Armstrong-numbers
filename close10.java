/*
Given 2 int values, return whichever value is nearest to the value 10, 
or return 0 in the event of a tie. Note that Math.abs(n) returns the 
absolute value of a number.
 */
package codingbat;
import java.util.*;

public class close10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Result: "+close(num1, num2));
    }
    
    public static int close(int num1,int num2){
        int num1_diff, num2_diff;
        num1_diff = Math.abs(10 - num1);
        num2_diff = Math.abs(10 - num2);
        
        if(num1_diff != num2_diff){
            if(num1_diff > num2_diff){
                return num2;
            }
            else{
                return num1;
            }
        }
        else{
            return 0;
        }
    }
}