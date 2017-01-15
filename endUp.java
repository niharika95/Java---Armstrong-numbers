/*
Given a string, return a new string where the last 3 chars are 
now in upper case. If the string has less than 3 chars, uppercase 
whatever is there. Note that str.toUpperCase() returns the uppercase 
version of a string.
 */
package codingbat;
import java.util.*;

public class endUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char alph;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        if(str.length() <= 3){
            str = str.toUpperCase();
        }
        else{
            String revstr = new StringBuilder(str).reverse().toString();
            StringBuilder temp = new StringBuilder(revstr);  
            for(int i = 0; i < 3 ;i++){
                alph = Character.toUpperCase(revstr.charAt(i));
                temp.setCharAt(i, alph);
            }          
            String orgstr = new StringBuilder(temp).reverse().toString();
            str = orgstr;
        }
        System.out.print("Result: "+str+"\n");
    }
}