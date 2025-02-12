package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator");
        while (!in.hasNextInt()) { // in.hasNextInt πρεπει να δινει integer ο χρηστης
            System.out.println("Error. Input must be int. Please insert numerator");
            in.nextLine(); // Καθαρίζει ολόκληρη την τρέχουσα γραμμή εισόδου όταν αυτή δεν είναι έγκυρη &
            //Βοηθά το πρόγραμμα να αποφύγει να "κολλάει" στον ίδιο λανθασμένο input.
        }
        numerator = in.nextInt();

        System.out.println("Please insert denominator");
        while (!in.hasNextInt()) { // in.hasNextInt πρεπει να δινει integer ο χρηστης
            System.out.println("Error. Input must be int. Please insert denominator");
            in.nextLine();
        }
        denominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Error. Denominator must not be zero.");
            System.exit(1); // Τερματισμός λόγω σφάλματος
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }

}
