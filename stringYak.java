/*
Suppose the string "yak" is unlucky. Given a string, 
return a version where all the "yak" are removed, but 
the "a" can be any char. The "yak" strings will not overlap.
 */
package codingbat;
import java.util.Scanner;

public class stringYak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        int count = 0;
        StringBuilder sb = new StringBuilder(str);
        for(int  i = 0; i < sb.length()-1; i++){
            count++;
            if(str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                sb = sb.deleteCharAt(i);
                sb = sb.deleteCharAt(i);
                sb = sb.deleteCharAt(i);
            }
        }
        System.out.print("\nResult: "+sb);
    }
}