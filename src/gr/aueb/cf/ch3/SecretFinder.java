package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Υπαρχει ενα SECRET που ειναι integer Και ο
 * χρηστης με μια μονο προσπαθεια θα προσπαθησει
 * να τον βρει.
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret: ");
        num = in.nextInt();

        if (num == SECRET) {
            System.out.println("You find it");

        } else {
            System.out.println("Failure!!");
        }
    }
}
