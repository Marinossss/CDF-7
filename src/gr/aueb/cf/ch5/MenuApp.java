package gr.aueb.cf.ch5;
/**
 * Εμφανιζει ενα μενου επιλογων και ο χρηστης
 * επιλεγει ενα Menu  item Και στη συνεχεια αναλογα
 * με την επιλογη, εκτελειται καποια ενεργεια.
 */

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = in.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid");
                continue;
            }

            doOnChoice(choice);



        } while (choice != 5);
    }

    public static void printMenu () {
        System.out.println("Επιλεξτε ενα απο τα παρακατω: ");
        System.out.println("1. Εισαγωγη");
        System.out.println("2. Διαγραφη");
        System.out.println("3. Αναζητηση");
        System.out.println("4. Ενημερωση");
        System.out.println("5. Εξοδος");
    }

    public static boolean isChoiceValid (int choice) {
        return choice >= 1 && choice <= 5;

    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Εισαγωγη process");
                break;
            case 2:
                System.out.println("Διαγραφη");
                break;
            case 3:
                System.out.println("Αναζητηση process");
                break;
            case 4:
                System.out.println("Ενημερωση process");
                break;
            case 5:
                System.out.println("Εξοδος process");
                break;
            default: //καλυπτει ολες τις αλλες περιπτωσεις εκτος απο αυτες που ειναι στην case
                System.out.println("ΛαΘος επιλογη");
                break;
        }
    }
}

