package forum;

import java.util.Scanner;

public class Usia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String kelompokUsia;
        boolean expectInput = true;
        while(expectInput) {
            System.out.print("Masukkan usia: ");
            int usia = scanner.nextInt();
            if (usia < 0) {
                System.out.println("Harap masukkan usia yang benar.");
            } else {
                if (usia <= 5) {
                    kelompokUsia = "Balita";
                } else if (usia <= 12) {
                    kelompokUsia = "Anak";
                } else if (usia <= 17) {
                    kelompokUsia = "Remaja";
                } else if (usia <= 60) {
                    kelompokUsia = "Dewasa";
                } else {
                    kelompokUsia = "Lansia";
                }
                expectInput = false;

                System.out.printf("Kelompok usia: %s", kelompokUsia);
            }
        }
    }
}
