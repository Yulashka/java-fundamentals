/* Alice tosses a fair coin until she sees two consecutive heads. Bob tosses another fair coin
until he sees a head followed by a tail.
Write a program to estimate the probability that Alice will make fewer tosses than Bob? */

public class AliceBobCoinFlip {
    public static void main(String[] args) {
        int aliceHeads = 0;
        int bobHeads = 0;
        int bobTails = 0;
        int aliceTosses = 0;
        int bobTosses = 0;
        boolean aliceConsecutive = false;

        while (aliceHeads != 2){
            double coinFlipAlice = Math.random();
            aliceTosses++;
            if (coinFlipAlice < 0.5) {
                if(aliceHeads == 0) {
                    aliceHeads++;
                    aliceConsecutive = true;
                } else {
                    if(aliceConsecutive) {
                        aliceHeads++;
                    }
                }
            } else {
                aliceConsecutive = false;
                aliceHeads = 0;
            }
        }

        while (bobHeads == 0 || bobTails == 0){
            double coinFlipBob = Math.random();
            bobTosses++;
            if (coinFlipBob < 0.5) {
                if (bobHeads == 0 && bobTails == 0) {
                    bobHeads++;
                } else if (bobHeads == 1 && bobTails == 0) {
                    bobHeads = 0;
                }
            } else {
                if (bobHeads == 1 && bobTails == 0) {
                    bobTails++;
                }
            }
        }
        System.out.println("Alice tossed " + aliceTosses + " times.");
        System.out.println("Bob tossed " + bobTosses + " times.");
    }
}
