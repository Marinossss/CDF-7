package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurosUsdConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Δηλωση και αρχικοποιηση Μεταβλητων
        int inputEuros;
        final int PARITY =99;
        int totalUsaCents, usaCents, usaDollars;
        //Εντολες
        System.out.println("Please insert an amount(In Euros): ");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;
        System.out.printf("%d euros = %d usa dollars & %d usa cents", inputEuros, usaDollars, usaCents);
    }
}
