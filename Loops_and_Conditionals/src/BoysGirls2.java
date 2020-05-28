/*nA couple beginning a family decides to keep having children until the couple keeps having children until
they have another child which is of the same sex as the first child..
Estimate the average number of children they will have via simulation. Also estimate the most common outcome
(record the frequency counts for 2, 3, and 4 children,and also for 5 and above).*/

public class BoysGirls2 {
    public static void main(String[] args) {
        int boys = 0;
        int girls = 0;
        int trials = 0;
        int avg = 0;
        int sumTrials = 0;

        for (int i = 0; i < 5; i++) {
            double firstRun = Math.random();
            if (firstRun < 0.5) {
                boys++;
                trials++;
                while (boys == 1) {
                    double gender = Math.random();
                    if(gender < 0.5) {
                        boys++;
                    } else {
                        girls++;
                    }
                    trials++;
                }
            } else {
                girls++;
                trials++;
                while (girls == 1) {
                    double gender = Math.random();
                    if(gender > 0.5) {
                        girls++;
                    } else {
                        boys++;
                    }
                    trials++;
                }
            }
            System.out.println("Boys =  " + boys);
            System.out.println("Girls =  " + girls);
            System.out.println();
            sumTrials = sumTrials + trials;
            avg++;
            boys = 0;
            girls = 0;
            trials = 0;
        }
        System.out.println(sumTrials / avg + " average number of kids");
    }
}

