/* 
The parameter weekday is true if it is a weekday, and the parameter vacation 
is true if we are on vacation. We sleep in if it is not a weekday or we're on 
vacation. Return true if we sleep in.
*/

package codingbat;

public class SleepIn {
    static boolean sleepFlag = false;
    public static void main(String[] args) {
        SleepIn brad = new SleepIn();
        SleepIn angie = new SleepIn();
        
        System.out.println("BRAD: ");
        brad.sleep(false, true);
        System.out.println("\nANGIE: ");
        angie.sleep(false, false);
    }    
    
    public static void sleep(boolean weekday, boolean vacation){
        if (!weekday && vacation){
            System.out.println("We will sleep in!");
        }
        else if(weekday && vacation){
            System.out.println("We will not sleep in!");
        }
        else if(!weekday && !vacation){
            System.out.println("We will not sleep in!");
        }
        else if(weekday&& !vacation){
            System.out.println("We will not sleep in!");
        }
    }
}