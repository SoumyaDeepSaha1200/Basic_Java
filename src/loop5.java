import java.util.Scanner;

public class loop5 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :-");
        num = Sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i);  // Print without space for the first number
            } else {
                System.out.print(" -- " + i);  // Print with space for subsequent numbers
            }
        }
    }
}
