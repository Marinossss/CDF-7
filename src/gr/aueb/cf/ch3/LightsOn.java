package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (<100) OR IS dark
 */
public class LightsOn {
    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isDark;
        boolean isCarRunning;
        boolean isRaining;
        boolean areLightsOn;
        int carSpeed;

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert if it is raining:");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark: ");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed: ");
        carSpeed = in.nextInt();

        isCarRunning = (carSpeed > MAX_CAR_SPEED);
        areLightsOn = isRaining && (isDark ||  isCarRunning);

        System.out.println("Turn lights on: " + areLightsOn);







    }


}
