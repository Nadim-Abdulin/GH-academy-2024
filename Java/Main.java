 package PrimeNumber;

import java.util.Scanner;

//TIP To  <b>Run</b >  code  press   <shortcut   actionId="Run"/> or
// click the  <icon src="AllIcons.Actions.Execute"/>   icon  in the g utter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the  user;
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //  Check   if  the number  is prime;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    //     Method  to  check if a number is  prime;
    public static boolean isPrime(int num) {
        // Handle  edge  cases for numbers  less than 2 
        if (num <= 1) {
            return false;
        }

        // Check for divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, not a prime number
            }
        }

        return true; // If not divisible by any number, it's a prime number
    }
}
