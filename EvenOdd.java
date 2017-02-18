//Even-Odd
package codingbat;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }    
}