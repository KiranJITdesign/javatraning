import java.util.Scanner;

public class PowerOfTwo {
    static int powerOfTwo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * powerOfTwo(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Exponent should be a non-negative number.");
        } else {
            int result = powerOfTwo(n);
            System.out.println("2 raised to the power of " + n + " is: " + result);
        }

        sc.close();
    }
}
