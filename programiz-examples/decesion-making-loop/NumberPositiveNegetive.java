package decesionmakingandloop;

public class NumberPositiveNegetive {
    public static void main(String[] args) {
        double number = 12.3;

        if (number < 0.0)
            System.out.println(number + " is a negative number.");

            // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

            // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
    }
}
