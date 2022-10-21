package writingHW;

import java.util.Scanner;

public class Pro_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value :  ");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value :");
        int second = scanner.nextInt();
        Pro_15 t = new Pro_15();
        t.Pro_15(first, second);
        scanner.close();
    }

    private void Pro_15(int a, int b) {
        int c;
        System.out.println("Before the swapping, The variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println(" After the swapping, The variable is : " + a + " and second variale is : " + b);
    }


}
