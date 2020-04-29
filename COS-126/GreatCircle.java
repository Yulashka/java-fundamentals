/* The great-circle distance is the length of the shortest path between two points
(x1,y1) and (x2,y2) on the surface of a sphere,
where the path is constrained to be along the surface.
This program takes four double command-line arguments x1, y1, x2,
and y2 — the latitude and longitude (in degrees) of two points on the surface
of the earth — and prints the great-circle distance (in kilometers) between them.*/

public class GreatCircle {
    public static void main(String[] args) {
        // longtitude and latitude of one point
        double longX1 = Math.toRadians(Double.parseDouble(args[0]));
        double latY1 = Math.toRadians(Double.parseDouble(args[1]));

        // longtitude and latitude of second point
        double longX2 = Math.toRadians(Double.parseDouble(args[2]));
        double latY2 = Math.toRadians(Double.parseDouble(args[3]));

        // radius of the Earth
        double r = 6371.0;

        double state1 = Math.pow(Math.sin((longX2 - longX1) / 2), 2);
        double state2 = Math.pow(Math.sin((latY2 - latY1) / 2), 2);
        double squareRoot = Math.sqrt(state1 + Math.cos(longX1) * Math.cos(longX2) * state2);
        double distance = 2 * r * Math.asin(squareRoot);
        System.out.println(distance + " kilometers");
    }
}

