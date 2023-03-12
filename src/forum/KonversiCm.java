package forum;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FORUM BINUS INTRODUCTION TO PROGRAMMING SESSION 3
 * >>> tulis code yang dapat mengubah meter menjadi cm
 */
public class KonversiCm {
    public static void main(String[] args) {
        // Get user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan nilai dalam meter:");

        boolean expectInput = true;
        while (expectInput) {
            try {
                // Konversi nilai
                float meter = userInput.nextFloat();
                float cm = meter * 100;

                // Tampilkan nilai cm
                System.out.println("Nilai dalam centimeter adalah: " + cm);
                expectInput = false;
            } catch (InputMismatchException e) {
                // Tampilkan pesan bila nilai input bukan desimal
                System.out.println("Masukkan nilai dalam desimal!");
                userInput.next();
            }
        }
    }
}
