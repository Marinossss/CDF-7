package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Να λαμβανει ως Input απο τον χρηστη ενα διψηφιο ακεραιο και να
 * υπολογιζει και να εκτυπωνει το αθροισμα των ψηφιων του. για παραδειγμα
 * αν ο χρηστης δωσει τον ακεραιο 15, θα πρεπει το αποτελεσμα να ειναι 1+5 = 6
 */
public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int leftDigit, rightDigit, sum;
        int inputNum;


        System.out.println("Δωσε μου εναν αριθμο: ");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, left digit: %d, Right digit: %d, Sum: %d",
        inputNum, leftDigit, rightDigit, sum);


    }

}
