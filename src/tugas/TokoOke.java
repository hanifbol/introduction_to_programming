package tugas;

import java.util.Scanner;

public class TokoOke {
    public static void main(String[] args) {
        // Initiate scanner
        Scanner input = new Scanner(System.in);

        // Input nama user
        System.out.println("Masukkan nama anda:");
        String nama = input.nextLine();

        // Welcome message
        System.out.println("\nStok Gudang Input Barang");
        System.out.println("#########################\n");
        System.out.println("Selamat Datang " + nama + '\n');

        // Input detail barang
        System.out.println("Masukkan nama barang yang mau ditambah:");
        String namaBarang = input.nextLine();
        System.out.println("Masukkan jumlah barang yang mau ditambah:");
        int jumlahbarang = input.nextInt();
        System.out.println("Masukkan harga beli untuk barang tersebut:");
        double hargaBeli = input.nextDouble();
        System.out.println("Masukkan harga jual untuk barang tersebut:");
        double hargaJual = input.nextDouble();

        // Tampilkan detail barang
        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("#########################\n");
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Jumlah Barang : " + jumlahbarang);
        System.out.printf("Harga Beli    : %.2f\n", hargaBeli);
        System.out.printf("Harga Jual    : %.2f", hargaJual);
    }
}
