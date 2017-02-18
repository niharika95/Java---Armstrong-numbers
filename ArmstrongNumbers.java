//Check if a number is Armstrong or not.
package codingbat;
import java.util.Scanner;

public class ArmstrongNumbers {
    static int sum = 0;
    static int ar = 0;
    static int armstrongnum = 0;
    
    public static void arm(){
        int number = ar % 10;
        sum = sum + (int)Math.pow(number,3);
        ar = ar/10;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number to check if it is an Armstrong number or not:");
        ar = sc.nextInt();
        armstrongnum = ar;
        int len = (int)(Math.log10(ar)+1);
        for(int i = 0; i < len; i++){
            arm();            
        }
        if(sum == armstrongnum){
            System.out.println("The number is an armstrong number!");
        }
        else{
            System.out.println("The number is NOT an armstrong number!");
        }
    }   
}