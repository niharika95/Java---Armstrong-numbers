/*
Given 2 int values, return true if one is negative and one is 
positive. Except if the parameter "negative" is true, then 
return true only if both are negative.
 */
package codingbat;
import java.util.*;

public class posNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, flag = 0;
        System.out.println("Enter two integers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        
        if(num1 > 0){
            if(num2 < 0){
                flag = 1;
            }
        }
        if(num2 > 0){
            if(num1 < 0){
                flag = 2;
            }
        }
        if(num1 > 0){
            if(num2 > 0){
                flag = 3;
            }
        }
        if(num1 < 0){
            if(num2 < 0){
                flag = 4;
            }
        }
        
        if(flag == 1 || flag == 2 || flag == 4){
            System.out.println("Negative!");
        }
        else{
            System.out.println("Positive!");
        }
    }
}