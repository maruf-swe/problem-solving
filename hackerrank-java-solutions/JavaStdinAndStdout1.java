import java.util.Scanner;

public class JavaStdinAndStdOut1 {
    public static void main(String[] args) {
        /*
        In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must
             be printed on a new line.
         */
        Scanner scanner = new Scanner(System.in);
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();
        scanner.close();

        System.out.println(myInt1);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}
