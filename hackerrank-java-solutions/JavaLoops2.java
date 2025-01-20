
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            int a = scanner.nextInt(); // Initial value
            int b = scanner.nextInt(); // Increment value
            int n = scanner.nextInt(); // Number of terms

            generateSequence(a, b, n);
        }

        scanner.close();
    }

    private static void generateSequence(int a, int b, int n) {
        int value = a;

        for (int j = 0; j < n; j++) {
            value += (1 << j) * b;
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
