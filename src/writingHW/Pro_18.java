package writingHW;

import java.util.Scanner;

public class Pro_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();
        Pro_18 printOperation = new Pro_18();
        printOperation.printTheOperation(firstNumber, secondNumber);
        scanner.close();
    }

    public void printTheOperation(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The division of " + a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
    }
}


