package gr.aueb.cf.ch2;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/**
 * Convert miles to km.
 */
public class MilesTokm {

    public static void main(String[] args) {
     final double KM_PER_MILE = 1.6;
     double inputMiles = 0.0;
     double kilometers = 0.0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert miles: ");

        inputMiles = in.nextDouble();

        kilometers = inputMiles * KM_PER_MILE;

        System.out.println("Miles: " + inputMiles + ", km" + kilometers);



    }
}
