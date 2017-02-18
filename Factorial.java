// Factorial of a number
package codingbat;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fac = 1;
        if(num == 1){
                System.out.println("1");
            }
        for(int i = 1; i <= num; i++){
            fac = fac * i;
        }
        System.out.println("\nThe factorial of " + num + " is " + fac);
    }    
}