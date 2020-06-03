/*Program that compute sin x and cos x using the Taylor series expansions*/

public class Cos {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double factorial = 1.0;
        double sum = 1;
        boolean operator = false;
        // sin x = 1 - x^2/2! + x^2/2! - x^2/2! + ..
        for (int i = 2; i <= 120; i = i + 2) {
            factorial = factorial * i * (i - 1);
            if(operator) {
                sum = sum + (Math.pow(x, i) / factorial);
                operator = false;
            }
            else {
                sum = sum - (Math.pow(x, i) / factorial);
                operator = true;
            }
        }

        System.out.println("my result: " + sum);
        System.out.println("java result: " + Math.cos(x));
    }
}
