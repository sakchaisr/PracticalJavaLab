package InputOutput;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        int num1, num2, output;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter number1:");
        num1 = number.nextInt();

        System.out.print("Enter number2:");
        num2 = number.nextInt();

        output = num1 + num2;
        System.out.println("Sum =" + output);

    }
}
