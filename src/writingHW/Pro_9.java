package writingHW;

import java.util.Scanner;

public class Pro_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Pro_9 t = new Pro_9();
        t.convertUppercaseToLowerCase(uppercase);
        scanner.close();
    }

    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }

}


