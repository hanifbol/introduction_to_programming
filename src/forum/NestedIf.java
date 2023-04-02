package forum;

public class NestedIf {
    public static void main(String[] args) {
        //Salah
        char grade;
        int score = 85;
        if (score >= 90)
            grade = 'A';
        if (score >= 80)
            grade = 'B';
        if (score >= 70)
            grade = 'C';
        if (score >= 60)
            grade = 'D';
        else
            grade = 'F';
        System.out.println("Score: " + score + " Grade: " + grade);



        //Benar
//        char grade;
//        int score = 85;
//        if (score >= 90)
//            grade = 'A';
//        else if (score >= 80)
//            grade = 'B';
//        else if (score >= 70)
//            grade = 'C';
//        else if (score >= 60)
//            grade = 'D';
//        else
//            grade = 'F';
//        System.out.println("Score: " + score + " Grade: " + grade);
    }
}
