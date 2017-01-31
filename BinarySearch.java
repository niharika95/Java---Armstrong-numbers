// Binary Search
package codingbat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    static int set[] = new int[10];
    
    public static void generateRandom(){
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            int ran = r.nextInt(100);
            set[i] = ran;
        }
        // Sorting the set.
        Arrays.sort(set);
        for(int i = 0; i < set.length; i++){
            System.out.println("Debug 1: sorted array = "+set[i]);
        }
    }
    
    public static void binSearch(int num){
        int a = 0;
        int b = set.length-1;
        int c = 0;        
        while(true){
            c = (a+b)/2;
            if(num == set[c]){
                System.out.println("Yes! The number exists in the set.");
                break;
            }
            else{
                if(b-a == 1){
                    System.out.println("No! The number does not exist.");
                    break;
                }
                else if(num < set[c]){
                    b = c;
                }
                else if(num > set[c]){
                    a = c;
                }
            }
        }
    }
    
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        generateRandom();
        System.out.println("Enter the number you wish to search for:");
        int num = sc.nextInt();
        binSearch(num);
    }    
}