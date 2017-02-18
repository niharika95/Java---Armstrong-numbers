/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
 */
package codingbat;
import java.util.Scanner;

public class StringSplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orgstr, newstr = "";
        int i,j=0;
        System.out.print("Enter a string: ");
        orgstr = sc.nextLine();
        for(i = 0; i < orgstr.length(); i++){
            for(i = 0; i < j; i++){
                newstr = newstr + orgstr.charAt(j);
            }
            j++;
        }
        System.out.println("Result: "+newstr);
    }   
}