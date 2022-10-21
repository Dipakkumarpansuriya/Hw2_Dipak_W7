package writingHW;

import java.util.Scanner;

public class Pro_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();

        Pro_7 t = new Pro_7();
        t.convertTempToDegreeCelsius(temp);
        scanner.close();
    }

    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }
}


