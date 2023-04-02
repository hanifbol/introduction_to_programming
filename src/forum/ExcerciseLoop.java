package forum;

import java.util.Random;
import java.util.Scanner;

public class ExcerciseLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        while (true){
            // Generate random number
            int num = random.nextInt(100);
            System.out.printf("%nNumber: %d%n", num);

            // Ask if user wants to continue
            System.out.print("Continue? ");
            while (true) {
                String ask = userInput.nextLine();
                if (ask.equalsIgnoreCase("N")) {
                    System.out.print("Thank you for using this program");
                    System.exit(0);
                } else if (ask.equalsIgnoreCase("Y")) {
                    break;
                } else {
                    System.out.print("Harap jawab dengan Y/N: ");
                }
            }
        }
    }
}
