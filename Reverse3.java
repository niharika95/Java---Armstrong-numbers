/*
Given an array of ints length 3, return a new array with the 
elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 */
package codingbat;
import java.util.Scanner;
public class Reverse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int rev[] = new int[3];
        System.out.println("Enter an array of length 3:");
        for(int  i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
            rev[i] = arr[i];
        }
        System.out.println("Reversed Array:");
        for(int j = rev.length-1; j >= 0; j--){            
            System.out.println(rev[j]);
        }
    }
}