/*
We'll say that a 1 immediately followed by a 3 in an array is an
"unlucky" 1. Return true if the given array contains an unlucky 1
in the first 2 or last 2 positions in the array.
 */
package codingbat;
import java.util.Scanner;
public class Unlucky1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, flag = 0;
        System.out.print("Enter the number of elements in the array (more than 2): ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " elements in the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 2; i++){
            if(arr[i] == 1 && arr[i+1] == 3){
                flag++;
            }           
        }
        if(flag == 0){
            if(arr[arr.length-2] == 1 && arr[arr.length-1] == 3){
                    flag++;
            }
        }
        
        if(flag == 0){
            System.out.println("It is a lucky 1!");
        }
        else{
            System.out.println("It is an unlucky 1!");
        }
    }
}