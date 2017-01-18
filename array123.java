/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 */
package codingbat;
import java.util.*;

public class array123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        boolean flag = false;
        System.out.println("Enter 6 numbers:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] == 1){
                if(arr[i+1] == 2){
                    if(arr[i+2] == 3){
                        flag = true;
                    }
                }
            }
            else{
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("1, 2, 3 are in sequence!");
        }
        else{
            System.out.println("1, 2, 3 are not in sequence!");
        }
    }
}