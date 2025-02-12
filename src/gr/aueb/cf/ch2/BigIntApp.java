package gr.aueb.cf.ch2;


import java.math.BigInteger;

/**
 * BigInteger class demo.
 */

public class BigIntApp {
    public static void main(String[] args) {
        //Dceclarations and Initializations
        BigInteger bigNum1 = new BigInteger("10");
        BigInteger bigNum2 = new BigInteger("10");
        BigInteger result;

        //Commands
        result = bigNum1.add(bigNum2);

        //Priting the results
        System.out.printf("%,d", result);

    }
}
