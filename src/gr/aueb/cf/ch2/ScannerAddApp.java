package gr.aueb.cf.ch2;

/**Scanner Demo. Reads two integers from the
 * std input(keyboard) and calculates the result
 */

import java.util.Scanner;

public class ScannerAddApp {

    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        //Εντολες
        System.out.println("Please insert two integers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("Το αθροισμα των %d και %d ειναι ισο με το %d", num1, num2, sum);


    }
}
