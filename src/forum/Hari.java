package forum;

public class Hari {
    public static void main(String[] args) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("WHILE LOOP");
        int n = 0;
        while (n < days.length) {
            System.out.println(days[n]);
            n++;
        }

        System.out.println("\nDO-WHILE LOOP");
        int m = 0;
        do {
            System.out.println(days[m]);
            m++;
        } while (m < days.length);

        System.out.println("\nFOR EACH LOOP");
        for (String day: days) {
            System.out.println(day);
        }
    }
}
