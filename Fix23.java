/*
Given an int array length 3, if there is a 2 in the array immediately 
followed by a 3, set the 3 element to 0. Return the changed array.
 */
package codingbat;
import java.util.Scanner;

public class Fix23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("Enter an array of length 3:");
        for(int  i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 2; i++){
            if(arr[i] == 2 && arr[i+1] == 3){
                arr[i+1] = 0;
            }
        }
        System.out.println("Array after fixing: ");
        for(int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }
    }
}