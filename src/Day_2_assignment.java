//Write a simple program by using conditional statements with one example

import java.util.Scanner;
public class Day_2_assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}    

// Output
/*
Enter a number: 10
The number is positive.
 */

/*
Enter a number: -10
The number is negative.
 */

 /*
Enter a number: 0
The number is zero.
  */