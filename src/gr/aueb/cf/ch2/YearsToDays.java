package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (ages) to days.
 */

public class YearsToDays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // δηλωση και αρχικοποιήση μεταβλιτων
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;
        //Εντολες
        System.out.println("Insert your age: ");
        age = in.nextInt();

        days = age * DAYS_PER_YEAR;
        //Εκτυπωση αποτελεσματων
        System.out.println("Age in years: " + age + " Age in days: " + days);

    }
}
