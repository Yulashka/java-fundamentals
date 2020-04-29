/* This program prints five uniform random numbers between 0 and 1,
their average value, and their minimum and maximum values. */

public class UniformRandomNum {
    public static void main(String[] args) {
        // five random numbers from 0-1
        double random1 = StdRandom.uniform();
        double random2 = StdRandom.uniform();
        double random3 = StdRandom.uniform();
        double random4 = StdRandom.uniform();
        double random5 = StdRandom.uniform();
        System.out.println("Five random numbers:");
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);
        System.out.println(random4);
        System.out.println(random5);

        // average value
        double average = (random1 + random2 + random3 + random4 + random5) / 5;
        System.out.println("Average value: " + average);

        // minimum value
        double min1 = Math.min(random1, random2);
        double min2 = Math.min(min1, random3);
        double min3 = Math.min(min2, random4);
        double min4 = Math.min(min3, random5);
        System.out.println("Minimum value: " + min4);

        // maximum value
        double max1 = Math.max(random1, random2);
        double max2 = Math.max(max1, random3);
        double max3 = Math.max(max2, random4);
        double max4 = Math.max(max3, random5);
        System.out.println("Maximum value: " + max4);

    }
}
