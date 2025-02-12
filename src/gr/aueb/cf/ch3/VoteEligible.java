package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 *Δικαιωμα ψηφου σε ηλικιες > 18.
 * Ελεγχει αν μια ηλικια εχει δικαιωμα να ψηφισει.
 */
public class VoteEligible {

    public static void main(String[] args) {
        boolean isAllowedVote = false;
        final int ALLOW_AGE = 18;
        int inputAge;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert your age: ");
        inputAge = in.nextInt();

        isAllowedVote = inputAge >= ALLOW_AGE;

        System.out.printf("You allow to vote: %b",isAllowedVote );

    }
}
