package forum;

import java.util.ArrayList;

public class OverloadingMethod {
    public static void main(String[] args) {
        // Konversi teks tunggal
        String newText = stripUpper("A recursive method is one that directly or indirectly invokes itself.");
        System.out.printf("Hasil konversi teks: %n%s%n%n", newText);

        // Konversi array teks
        ArrayList<String> texts = new ArrayList<>();
        texts.add("Recursion is an alternative form of program control.");
        texts.add(" It is essentially repetition without a loop control.");
        texts.add("It can be used to write simple, clear solutions for inherently recursive\n" +
                "problems that would otherwise be difficult to solve.\n");
        ArrayList<String> newTexts = stripUpper(texts);
        System.out.println("Hasil konversi teks array:");
        for (String text: newTexts) {
            System.out.println(text);
        }
    }

    private static String stripUpper(String text) {
        text = text.strip();
        text = text.toUpperCase();
        return text;
    };

    private static ArrayList<String> stripUpper(ArrayList<String> texts) {
        ArrayList<String> newTexts = new ArrayList<>();
        for (String text: texts) {
            String newText = stripUpper(text);
            newTexts.add(newText);
        }
        return  newTexts;
    }
}
