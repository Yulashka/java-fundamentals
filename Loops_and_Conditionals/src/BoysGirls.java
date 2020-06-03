/* A couple beginning a family decides to keep having children until they have at least one of either sex.
Estimate the average number of children they will have via simulation. Also estimate the most common outcome
(record the frequency counts for 2, 3, and 4 children,and also for 5 and above).
Assume that the probability p of having a boy or girl is 1/2. */

public class BoysGirls {
    public static void main(String[] args) {
        int boys = 0;
        int girls = 0;
        int trials = 0;
        int avg = 0;
        int sumTrials = 0;

        for (int i = 0; i < 5; i++) {
            while (boys == 0 || girls == 0) {
                double gender = Math.random();
                if(gender < 0.5) {
                    boys++;
                } else {
                    girls++;
                }
                trials++;
            }
            System.out.println("Boys =  " + boys);
            System.out.println("Girls =  " + girls);
            sumTrials = sumTrials + trials;
            avg++;
            boys = 0;
            girls = 0;
            trials = 0;
        }
        System.out.println(sumTrials / avg + " average number of kids");

    }
}
