/****************************************************************
 *  Reverses the digits of a positive integer n using arithmetic. Then,
 *  reverse it again using string concatenation.
 *  test: 123456789
 *  987654321
 *  123456789
 *******************************************************/

public class DigitReverser {

    public static void main(String[] args) {
        // original integer
        int n = Integer.parseInt(args[0]);

        // reverse using arithmetic
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);

        // reverse again using string concatenation
        String s = "";
        while (m != 0) {
            int digit = m % 10;
            s = s + digit;
            m = m / 10;
        }
        System.out.println(s);
    }
}
