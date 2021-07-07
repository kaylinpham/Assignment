package kaylin.util;

import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInteger(String prompt) {
        int number;

        while (true) {
            try {
                System.out.print(prompt);
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Not an integer!");
            }
        }
    }

    public static double getDouble(String prompt) {
        double number;

        while (true) {
            try {
                System.out.print(prompt);
                number = Double.parseDouble(scanner.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Not a double!");
            }
        }
    }


    public static int getIntegerInRange(String prompt, int min, int max) {
        int number;

        while (true) {
            try {
                System.out.print(prompt);
                number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max)
                    return number;
            } catch (Exception e) {
                System.out.println("Not an integer!");
            }
        }
    }

    public static int getIntegerWithMin(int min, String prompt) {
        int number;

        while (true) {
            try {
                System.out.print(prompt);
                number = Integer.parseInt(scanner.nextLine());
                if (number >= min)
                    return number;
            } catch (Exception e) {
                System.out.println("Not an integer!");
            }
        }
    }

}
