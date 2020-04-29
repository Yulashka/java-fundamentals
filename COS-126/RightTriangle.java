/* This program takes three int command-line arguments
and determines whether they constitute the side lengths of some right triangle.
There are 2 conditions:
    - Each integer must be positive.
    - The sum of the squares of two of the integers must equal the square
     of the third integer. */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        boolean result = (a2 + b2 == c2 || b2 + c2 == a2 || a2 + c2 == b2) && (a > 0 && b > 0
                && c > 0);
        System.out.println(result);
    }
}


