package Introduction;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        float firstNum = 1.20f, secondNum = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + firstNum);
        System.out.println("Second number = " + secondNum);

        float temporary = firstNum;

        firstNum = secondNum;

        secondNum = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + firstNum);
        System.out.println("Second number = " + secondNum);
    }
}
