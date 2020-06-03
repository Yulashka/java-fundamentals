public class Clock {
    public static void main(String[] args) {
        for (int i = 1; i <= 24; i++) {
            if(i == 12) {
                System.out.println("12 noon");
            } else if (i <= 11) {
                System.out.println(i + " am");
            } else if (i > 12) {
                System.out.println((i - 12) + " pm");
            } else {
                System.out.println("12 noon");
            }
        }
    }
}
