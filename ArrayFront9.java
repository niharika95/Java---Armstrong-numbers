/*
Given an array of ints, return true if one of the first 4 elements 
in the array is a 9. The array length may be less than 4.
 */
package codingbat;
import java.util.Scanner;

public class ArrayFront9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];
        int flag = 0;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 4; i++){
            if(arr[i] == 9){
                flag++;
                break;
            }
        }
        if(flag == 1){
            System.out.println("True!");
        }
        else{
            System.out.println("False!");
        }
    }
}