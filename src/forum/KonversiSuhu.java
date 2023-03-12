package forum;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FORUM BINUS INTRODUCTION TO PROGRAMMING SESSION 3 - Latihan
 *
 * Buatlah program konversi suhu Celsius, Fahrenheit dan Kelvin.
 * Program meminta pengguna untuk memasukkan angka dalam Celcius,
 * mengubahnya menjadi Fahrenheit dan Kelvin.
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan nilai dalam celcius:");

        boolean expectInput = true;
        while (expectInput) {
            try {
                // Konversi nilai
                double celsius = userInput.nextFloat();
                double fahrenheit = (celsius * (9.0 / 5.0)) + 32;
                double kelvin = celsius + 273.15;

                // Tampilkan nilai cm
                System.out.println("Nilai dalam Fahrenheit adalah: " + fahrenheit + " F");
                System.out.println("Nilai dalam Kelvin adalah: " + kelvin + " K");
                expectInput = false;
            } catch (InputMismatchException e) {
                // Tampilkan pesan bila nilai input bukan desimal
                System.out.println("Masukkan nilai dalam desimal!");
                userInput.next();
            }
        }
    }
}
