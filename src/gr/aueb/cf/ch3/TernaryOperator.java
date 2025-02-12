package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of ternary operator on a common
 * use case, that is conditional assignment.
 * abs is always positive.
 */

public class TernaryOperator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please enter a num: ");
        num = in.nextInt();

//        if (num >= 0) abs = num;
//         else abs = -num;
        abs = (num >= 0) ? num : -num; // Ο τελεστής ? σημαίνει "αν" και ακολουθεί το πρώτο "μέρος" της συνθήκης.
        System.out.println("abs: " + abs); // ο τελεστης : σημαίνει "αν η συνθήκη είναι ψευδής" (δηλαδή αν το num είναι μικρότερο από το μηδέν). Σε αυτήν την περίπτωση, η τιμή του abs θα είναι το αντίθετο της τιμής του num. Με άλλα λόγια, παίρνουμε τον αρνητικό αριθμό
        // και τον κάνουμε θετικό (δηλαδή υπολογίζουμε την απόλυτη τιμή).


    }


}
