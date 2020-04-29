/* This program takes two names as command-line arguments
and prints hello and goodbye messages as shown below
(with the names for the hello message in the same order as the command-line arguments
and with the names for the goodbye message in reverse order). */

public class HelloGoodbye {
    public static void main(String[] args) {
        String fn = args[0];
        String sn = args[1];
        System.out.println("Hello " + fn + " and " + sn + ".");
        System.out.println("Goodbye " + sn + " and " + fn + ".");
    }
}
