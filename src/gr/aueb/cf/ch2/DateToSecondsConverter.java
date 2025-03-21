package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρεπει ημερες και ωρες και λεπτα
 * σε συνολικα δευτερολεπτα, ο χρηστης δινει τα δεδομενα
 * και εκτυπωνεται το τελικο αποτελεσμα
 */
public class DateToSecondsConverter {

    public static void main(String[] args) {
        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        Scanner in = new Scanner(System.in);
        int inputDays, inputHours, inputMinutes, inputSeconds;
        int totalSeconds = 0;

        System.out.println("Please insert days, hours, minutes, seconds: ");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SECONDS_PER_DAY + inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;

        System.out.printf(Locale.US,"Total seconds: %,d\n", totalSeconds);

    }}
