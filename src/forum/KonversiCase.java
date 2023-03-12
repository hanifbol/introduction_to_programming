package forum;

import java.util.Scanner;

/**
 * FORUM BINUS INTRODUCTION TO PROGRAMMING SESSION 3
 * >>> tulis kode yang dapat membaca dua string dan mengubahnya menjadi huruf kecil dan huruf besar
 */
public class KonversiCase {
    public static void main(String[] args) {
        // Initiate scanner
        Scanner userInput = new Scanner(System.in);

        // Input 1
        System.out.println("Masukkan text untuk diubah menjadi huruf besar:");
        String input1 = userInput.nextLine();

        // Input 2
        System.out.println("Masukkan text untuk diubah menjadi huruf kecil:");
        String input2 = userInput.nextLine();

        // Output
        System.out.println("Text 1:" + input1.toUpperCase());
        System.out.println("Text 2:" + input2.toLowerCase());
    }
}
