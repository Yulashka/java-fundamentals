/* Program that converts from CMYK format to RGB format using
 these mathematical formulas:
    white = 1 − black;
    red = 255 × white × (1 − cyan);
    green = 255 × white × (1 − magenta);
    blue = 255 × white × (1 − yellow );
Program takes four double command-line arguments cyan, magenta, yellow, and black;
It computes the corresponding RGB values, each rounded to the nearest integer */

public class CMYKtoRGB {
    public static void main(String[] args) {
        // CMYK colors inputm
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // RGB colors output formulas
        double white = 1 - black;
        int red = (int) Math.round(255 * white * (1 - cyan));
        int green = (int) Math.round(255 * white * (1 - magenta));
        int blue = (int) Math.round(255 * white * (1 - yellow));

        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
    }
}
