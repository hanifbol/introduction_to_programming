package forum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aritmatika {
    private static BufferedReader br = null;
    public static void main(String[] args) {

        System.out.println("Program Geometri");
        System.out.println("==================");
        System.out.println();

        boolean cek = true;

        while (cek) {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Pilih bentuk geometri untuk menghitung luas dan keliling: ");
                System.out.println("(1) Persegi");
                System.out.println("(2) Persegi panjang");
                System.out.println("(3) Lingkaran");
                int form = Integer.parseInt(br.readLine());

                String bentuk = "";
                double L = 0;
                double K = 0;
                boolean readyToCount = false;
                if (form == 1) {
                    bentuk = "persegi";
                    System.out.print("Masukkan sisi persegi:");
                    double s = Double.parseDouble(br.readLine());
                    L = s * s;
                    K = 4 * s;
                    readyToCount = true;
                } else if (form == 2) {
                    bentuk = "persegi panjang";
                    System.out.print("Masukkan panjang:");
                    double p = Double.parseDouble(br.readLine());
                    System.out.print("Masukkan lebar:");
                    double l = Double.parseDouble(br.readLine());
                    L = p * l;
                    K = 2 * (p + l);
                    readyToCount = true;
                } else if (form == 3) {
                    bentuk = "lingkaran";
                    System.out.print("Masukkan radius:");
                    double r = Double.parseDouble(br.readLine());
                    double pi =(22.0 / 7.0);
                    L = pi * r;
                    K = 2 * pi * r;
                    readyToCount = true;
                }

                if (readyToCount) {
                    System.out.println("Hasil luas bangun " + bentuk + " : " + L);
                    System.out.println("Hasil keliling bangun " + bentuk + " : " + K);
                    System.out.println();
                }

                System.out.print("Ingin coba lagi (Y/N) ? ");
                String coba = br.readLine();
                if (coba.equalsIgnoreCase("N"))
                    cek = false;
                else if (coba.equalsIgnoreCase("Y"))
                    cek = true;
                else
                    System.exit(0);
            }
            catch (IOException ioe) {
                System.out.println("Error IOException");
            }
        }
    }
}