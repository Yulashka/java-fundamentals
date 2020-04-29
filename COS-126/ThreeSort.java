/* This program takes three integer command-line arguments
and prints them in ascending order.*/

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // minimum value
        int minNum = Math.min(a, Math.min(b, c));

        // middle value
        int midNum = Math.max(Math.min(a, b), Math.min(b, c));

        // maximum value
        int maxNum = Math.max(a, Math.max(b, c));

        System.out.println(minNum + " " + midNum + " " + maxNum);
    }
}
