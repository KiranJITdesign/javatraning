public class Sales {
    public static void main(String[] args) {
        int[] sales = {123, 156, 123, 168, 100};
        int max = sales[0];
        int min = sales[0];
        int sum = sales[0];

        for (int i = 1; i < sales.length; i++) {
            sum += sales[i];
            if (sales[i] > max) {
                max = sales[i];
            }
            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("total sales " + sum);
        System.out.println("highest sales " + max);
        System.out.println("lowest sales " + min);
    }
}
