/*
Given an array of ints, return the number of times 
that two 6's are next to each other in the array. 
Also count instances where the second "6" is actually a 7.
 */
package codingbat;
import java.util.Scanner;

public class Array667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        int flag = 0;
        System.out.println("Enter 7 numbers: ");
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            if(arr[i] == 6 && (arr[i+1] == 6 || arr[i+1] == 7)){
                flag++;
            }
        }
        System.out.println("The occurence is "+flag+" times.");
    }
}