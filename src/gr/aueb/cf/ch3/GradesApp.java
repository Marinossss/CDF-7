package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρηστης θα δινει:
 * 1. τους συνολικους βαθμους μαθηματων.
 * 2. το πληθως των μαθηματων.
 *
 * θα υπολογιζει τον μεσο ορο και θα χαρατηριζει
 * 'Αριστα' αν ο μ.ορος ειναι >= 9, 'Πολυ καλα' αν
 * ο μεσοςο ορος ειναι >= 7 και "καλως" αν ο μεσος
 * ορος ειναι >=5 και 'Αποτυχια αν ο μ.ο ειναι
 * κατω απο το 5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;
        System.out.println("Please insert total marks: ");
        totalMarks = in.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be zero.");
            System.exit(1);

        }

        System.out.println("Please insert courses count.");
        coursesCount = in.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. the average must be less or equal than 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }
    }
}
