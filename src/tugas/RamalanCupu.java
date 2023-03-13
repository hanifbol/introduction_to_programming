package tugas;

import java.util.Random;
import java.util.Scanner;

public class RamalanCupu {
    public static void main(String[] args) {
        // Initiate scanner
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++\n");

        // Input data user
        System.out.println("Data Anda :");
        System.out.println("************");
        System.out.println("Masukkan Nama Anda:");
        String namaUser = input.nextLine();
        System.out.println("Masukkan Umur Anda:");
        int umurUser = Integer.parseInt(String.valueOf(input.nextLine()));

        // Input data pasangan
        System.out.println("\nData Pasangan Anda :");
        System.out.println("***********************");
        System.out.println("Masukkan Nama Pasangan Anda:");
        String namaPasangan = input.nextLine();
        System.out.println("Masukkan Umur Pasangan Anda:");
        int umurPasangan = Integer.parseInt(String.valueOf(input.nextLine()));

        // Show input data
        System.out.printf("\n%s [%d] tahun\n\n", namaUser, umurUser);
        System.out.println("  ***    ***");
        System.out.println(" *****..*****");
        System.out.println("**************");
        System.out.println(" ************");
        System.out.println("   ********");
        System.out.println("     ****");
        System.out.println("      **\n");
        System.out.printf("%s [%d] tahun\n\n", namaPasangan, umurPasangan);

        // Show result
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        if (input.hasNextLine()) {
            // Generate result
            Random r = new Random();
            double matchResult = r.nextDouble() * (100 - 50) + 50;
            System.out.printf("Kecocokan anda dengan pasangan anda adalah : %.2f%%\n", matchResult);
        }

        // End message
        System.out.println("Terima kasih karena anda telah menggunakan jasa Ramalan kami.. ^^v");
    }
}
