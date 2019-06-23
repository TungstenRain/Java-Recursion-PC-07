package ch16pc07;

import java.util.Scanner;

/**
 * Recursive Power
 * Demonstration of using a recursive method to raise a number to a power
 * @author frank
 */
public class Ch16pc07 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int a, n;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request input from user
        System.out.println("Welcome to the Recursive Power program.");
        System.out.println("x = a to the nth power -- Integers only");
        System.out.print("Please enter the value of the number you want raised (a): ");
        a = keyboard.nextInt();
        System.out.print("Please enter the value of the number you want it raised to (n): ");
        n = keyboard.nextInt();
        
        // Calculate and display the result
        System.out.println("The result of " + Integer.toString(a) + " to the " +
                Integer.toString(n) + "th power = " + String.valueOf(power(a, n)));
        
    }
    
    /**
     * Recursive method to raise a number to a given power
     * @param a int The number to be raised
     * @param n int The number to be raised to
     * @return double The value of a to the nth power
     */
    private static double power(int a, int n) {
        if (n == 0)
            return 1d;
        else if (n < 0) {   // n is a negative value
            if (a == 0)
                throw new IllegalArgumentException("It's impossible to raise 0 to the power of a negative value.");
            else
                return 1 / (power(a, -n));
        } else {
            double powerOfHalfN = power(a, (n/2));
            double[] factor = {1, a};
            return factor[n % 2] * powerOfHalfN * powerOfHalfN;
        }
    }

}
