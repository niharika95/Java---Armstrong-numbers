/*
Given an array of integers, we'll say that a triple is a value 
appearing 3 times in a row in the array. Return true if the 
array does not contain any triples.
 */
package codingbat;
import java.util.*;

public class noTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int flag = 0;
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++){
            int x = arr[i];
            if(x == arr[i+1]){
                if(x == arr[i+2]){
                    flag = 1;                    
                }
            }
        }
        if(flag == 1){
            System.out.println("It contains triples!");
        }
        else{
            System.out.println("It does not contain triples!");
        }
    }
}