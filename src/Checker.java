
import java.util.Scanner;

/*
 * Created by Nick just for FUN!
 * Code is poetry.
 */

public class Checker {
    
    // Override main method here
    public static void main(String[] args){
        
        // Create a scanner to get input from System.
        Scanner input = new Scanner(System.in);
        
        // Declare variables
        int fetchedYear; boolean isLeapYear;
        
        // Prompt user to enter the Year
        System.out.println("Please enter the year to check: ");
        
        // Define fetched year
        fetchedYear = input.nextInt();
        
        // isLeapYear will hold the return value of method checkLeapYear
        isLeapYear = checkLeapYear(fetchedYear);
        
        // Simple statement to check and print output
        if (isLeapYear){
            System.out.println("\n"+"The Year is a leap year");
        }else{
            System.out.println("\n"+"The Year is not a leap year");
        }
   
        return;
    }
    
    // Method to check Leap Year
    public static boolean checkLeapYear(int year){
        
        if (year % 4 == 0){
                if (year % 100 == 0){
                    return year % 400 == 0;
                }
                else{
                    return true;
                }
            }
            else {
                return false;
            }
    }
    
}
