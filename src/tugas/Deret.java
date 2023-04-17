package tugas;

import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial");
        System.out.println();

        boolean repeat;
        do {
            // Input banyak angka
            String inpCount = "Masukkan banyak angka yang mau dicetak [2..10]";
            String errCount = "Harap masukkan bilangan bulat antara 2 s.d. 10";
            int countNumber = inputNumber(2, 10, inpCount, errCount);

            // Input beda angka
            String inpDiff = "Masukkan beda masing-masing angka [2..9]";
            String errDiff = "Harap masukkan bilangan bulat antara 2 s.d. 9";
            int diffNumber = inputNumber(2, 9, inpDiff, errDiff);

            // Calculation
            StringBuilder txtAritmatika = new StringBuilder();
            StringBuilder txtGeometri = new StringBuilder();
            StringBuilder txtFaktorial = new StringBuilder();
            int elemenAritmatika = 1;
            int elemenGeometri = 1;
            int elemenFaktorial = countNumber;
            int faktorial = 1;
            for (int i = 0; i < countNumber; i++) {
                txtAritmatika.append(elemenAritmatika).append(" ");
                txtGeometri.append(elemenGeometri).append(" ");
                if (elemenFaktorial > 1) {
                    txtFaktorial.append(elemenFaktorial).append(" * ");
                } else {
                    txtFaktorial.append(elemenFaktorial);
                }

                elemenAritmatika += diffNumber;
                elemenGeometri *= diffNumber;
                faktorial *= elemenFaktorial;
                elemenFaktorial -= 1;
            }

            // Tampilkan hasil
            System.out.println();
            System.out.printf("%-15s :\n", "Deret Aritmatika");
            System.out.println(txtAritmatika);
            System.out.println();

            System.out.printf("%-15s :\n", "Deret Geometri");
            System.out.println(txtGeometri);
            System.out.println();

            System.out.printf("%-15s :\n", String.format("%s %d", "Faktorial dari", countNumber));
            System.out.printf("%s = %d", txtFaktorial, faktorial);
            System.out.println();

            // Ask for repeat
            repeat = askRepeat();
        } while (repeat);
    }

    private static int inputNumber(int min, int max, String inpMsg, String errMsg) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        boolean expectInput = true;
        while (expectInput) {
            System.out.printf("%-48s: ", inpMsg);
            try {
                userInput = Integer.parseInt(String.valueOf(input.nextLine()));
                if ((userInput < min) || (userInput > max)) {
                    System.out.printf("%s\n\n", errMsg);
                } else {
                    expectInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.printf("%s\n\n", errMsg);
            }
        }
        return userInput;
    }

    private static boolean askRepeat() {
        Scanner input = new Scanner(System.in);
        boolean repeat = false;

        System.out.println();
        boolean expectInput = true;
        while (expectInput) {
            System.out.print("Anda mau ulang (y/t) : ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("T")) {
                expectInput = false;
            } else if (answer.equalsIgnoreCase("Y")) {
                repeat = true;
                expectInput = false;
            }
        }
        System.out.println();
        return  repeat;
    }
}
