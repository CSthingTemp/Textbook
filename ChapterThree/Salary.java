import java.util.Scanner;
import java.text.NumberFormat;

public class Salary{
    public static void main(String[] args){
        double currentSalary;      // employee's current  salary
        double raise;              // amount of the raise
        double newSalary;          // new salary for the employee
        String rating;             // performance rating
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
        
        // Compute the raise using if ...
        
        if(rating.charAt(0)=='E')
            raise=.06*currentSalary;
        else if(rating.charAt(0)=='G')
            raise=.04*currentSalary;
        else if(rating.charAt(0)=='P')
            raise=.015*currentSalary;
        else{
            System.out.println("Please enter a valid rating next time.");
            return;
        }
        
        newSalary = currentSalary + raise;
        
        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary:           " + money.format(currentSalary));
        System.out.println("Amount of your raise:     " + money.format(raise));
        System.out.println("Your new salary:          " + money.format(newSalary));
        System.out.println();
    }
}
