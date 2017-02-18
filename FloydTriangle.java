// Floyd Triangle
package codingbat;
import java.util.Scanner;

public class FloydTriangle {
    static int count= 1;
    
    public static void print(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(count + "  ");
                count++;
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("\n");
        print(rows);
    }
}