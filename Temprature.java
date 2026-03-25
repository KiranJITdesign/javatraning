import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        System.out.println("enter the temp for week");
        double[] temp = new double[7];
        double sum = 0.0;

        for (int i = 0; i < 7; i++) {
            temp[i] = scanner.nextDouble();
            sum += temp[i];
        }

        double avg = sum / temp.length;
        System.out.printf("Average temperature for the week: %.2f%n", avg);
        System.out.println("Days above average:");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > avg) {
                System.out.printf("%s : %.2f%n", days[i], temp[i]);
            }
        }

        scanner.close();
    }
}
