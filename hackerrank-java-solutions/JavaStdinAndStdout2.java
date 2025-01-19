import java.util.Scanner;
/*
Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
 */
public class JavaStdinAndStdout2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInt = scanner.nextInt();
        double numDouble = scanner.nextDouble();
        scanner.nextLine();
        String str = scanner.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + numDouble);
        System.out.println("Int: " + numInt);
        scanner.close();
    }
}
