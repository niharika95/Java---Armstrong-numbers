/*
Given a string, return a string length 1 from its front, unless front is false, 
in which case return a string length 1 from its back. The string will be non-empty.
 */
package codingbat;
import java.util.Scanner;

public class TheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="";
        char res;
        boolean bool=true;
        for(int i = 0; i < 10; i++){
            System.out.println("Enter a string: ");
            str = sc.nextLine();
            bool = generateBool(bool);
            System.out.println(logic(str, bool));
        }
    }
    
    public static boolean generateBool(boolean bool){
        return (Math.random() < 0.5);
    }
    
    public static char logic(String str, boolean bool){
        if(bool == true){
            return str.charAt(0);
        }
        else{
            return str.charAt(str.length()-1);
        }
    }
}