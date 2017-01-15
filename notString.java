/*
Given a string, return a new string where "not " has been added 
to the front. However, if the string already begins with "not", 
return the string unchanged. Note: use .equals() to compare 2 strings.
*/
package codingbat;
import java.util.*;

public class notString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, temp, result;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        temp = str.substring(0,3);
        if(temp.equals("not")){
            result = str;
        }
        else{
            result = "not "+str;
        }
        System.out.print("Result: "+result);
    }
}