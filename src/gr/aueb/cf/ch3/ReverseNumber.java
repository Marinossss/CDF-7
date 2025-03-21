package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρεφει ενα ακεραιο. πχ
 * το 123 γινεται 321
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;
        int reversed = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer: ");
        num = in.nextInt();

        tempNum = num;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /= 10;
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
