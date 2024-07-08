import java.util.Scanner;

public class loop6 { // Class name changed for clarity
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a non-negative number :-");
        num = Sc.nextInt();

        // Validate non-negative input (factorial is not defined for negative numbers)
        if (num < 0) {
            System.out.println("Invalid input: Factorial is not defined for negative numbers.");
            return;  // Exit program if input is invalid
        }

        long factorial = 1;  // Use long to handle larger factorials
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
