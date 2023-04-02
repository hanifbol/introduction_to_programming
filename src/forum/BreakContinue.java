package forum;

import java.util.*;

public class BreakContinue {
    public static void main(String[] args) {
        // Generate dummy daftar nilai siswa
        List <Map> students = new ArrayList();
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int nilai = random.nextInt(100);
            Map student = Map.of("no", i+1, "nilai", nilai);
            students.add(student);
        }

        /**
         * Pilih 5 siswa dengan nilai minimal 75 dari daftar nilai siswa yang ada.
         * Setelah mendapatkan 5 siswa dengan nilai tersebut, hentikan iterasi.
         */
        List <Map> selectedStudents = new ArrayList();
        for (Map student: students) {
            // Bila nilai kurang dari 75 maka murid tidak dipilih
            int nilai = (int) student.get("nilai");
            if (nilai < 75)
                continue;
            selectedStudents.add(student);

            // Hentikan pencarian bila murid yg dipilih sudah 5 orang
            if (selectedStudents.size() == 5)
                break;
        }

        System.out.println(selectedStudents.toString());
    }
}
