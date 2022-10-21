package writingHW;

import java.util.Scanner;

public class Pro_17 {

    public static void main(String[] args) {
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        scanner.close();
    }

    public static void convertDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }

}


