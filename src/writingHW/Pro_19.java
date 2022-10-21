package writingHW;

import java.util.Scanner;

public class Pro_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Pro_19 t = new Pro_19();
        t.convertStringToLowerCase(uppercase);
        scanner.close();

    }
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}


