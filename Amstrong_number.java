import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number L");
        int L = sc.nextInt();
        System.out.println("enter a number R");
        int R = sc.nextInt();

        System.out.printf("Armstrong numbers between %d and %d:%n", L, R);
        boolean found = false;
        for (int num = L; num <= R; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("none");
        }

        sc.close();
    }

    private static boolean isArmstrong(int value) {
        int original = value;
        int digits = 0;
        int temp = value;
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
        }

        temp = value;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}
