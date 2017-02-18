//Prime numbers in a given range.
package codingbat;
import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int st = sc.nextInt();
        System.out.println("Enter the ending number:");
        int en = sc.nextInt();
        for(int i = st; i <= en; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int i){
        if (i == 2 || i == 3 || i == 5 || i == 7){
            return true;
        }
        else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
            return true; 
        }
        else{
            return false;
        } 
    }
}