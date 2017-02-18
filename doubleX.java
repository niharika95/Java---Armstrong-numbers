/*
Given a string, return true if the first instance of "x" 
in the string is immediately followed by another "x".
 */
package codingbat;
import java.util.*;
        
public class doubleX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int j, flag = 0;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            j = i+1;
            if (str.charAt(i) == 'x'){
                if (str.charAt(j) == 'x'){
                    flag = 1;
                }
            }
        }
        if (flag == 1){
            System.out.println("True!");
        }
        else{
            System.out.println("False!");
        }
    }
}