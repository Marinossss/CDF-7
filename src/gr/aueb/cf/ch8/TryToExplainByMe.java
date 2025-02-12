package gr.aueb.cf.ch8;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TryToExplainByMe {

    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step = 0;
        Scanner in = new Scanner(System.in);
        int iterations = 0;

        // Ζητάμε τον startVal
        startVal = getValidInt(in, "Please enter the start value: ");

        // Ζητάμε τον endVal
        endVal = getValidInt(in, "Please enter the end value: ");

        // Ζητάμε το step
        step = getValidInt(in, "Please enter the step value: ");

        // Εκτελούμε τον βρόχο με τους έγκυρους αριθμούς
        for (int i = startVal; i <= endVal; i += step) {
            iterations++;
            System.out.println(i + " ");
        }

        System.out.println("Iterations: " + iterations);

        in.close();
    }

    // Μέθοδος για έγκυρη είσοδο ακεραίων
    public static int getValidInt(Scanner scanner, String prompt) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(prompt);
                value = scanner.nextInt(); // Δοκιμάζουμε να διαβάσουμε ακέραιο
                valid = true; // Αν επιτύχει, τερματίζουμε το βρόχο
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Καθαρίζουμε την εσφαλμένη είσοδο
            }
        }
        return value;
    }
}


