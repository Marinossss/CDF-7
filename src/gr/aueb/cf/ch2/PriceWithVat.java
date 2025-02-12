package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat 24%.
 */

public class PriceWithVat {
    public static void main(String[] args) {

        double vat, priceWithVat;
        double inputPrice;
        final double  VAT_RATE = 0.24;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the price: ");

        inputPrice = in.nextInt();
        vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + vat;

        System.out.printf("Price: %.2f, Vat: %2f, Price with vat: %.2f", inputPrice, vat, priceWithVat);

    }
}
