/*
Given an array of ints, return true if it contains 
a 2, 7, 1 pattern -- a value, followed by the value 
plus 5, followed by the value minus 1. Additionally 
the 271 counts even if the "1" differs by 2 or less 
from the correct value.
 */
package codingbat;
import java.util.Scanner;

public class Has271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Enter 6 numbers:");
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        pattern(arr);
    }
    
    public static void pattern(int[] arr){
        int flag = 0;
        for(int i = 0; i < 4; i++){
            if( arr[i+1] == (arr[i]+5) && arr[i+2] == (arr[i]-1) ){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Yes!!");
        }
        else{
            System.out.println("No!!");
        }
    }
}