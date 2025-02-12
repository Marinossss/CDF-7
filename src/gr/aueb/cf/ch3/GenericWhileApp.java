package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GenericWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int beginValue = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        int times = 0;
        int start = 0;

        while (times <= 3) {
                System.out.println("Please insert, start, endValue and step: ");
            start = in.nextInt();
            endValue = in.nextInt();
            step = in.nextInt();

            while (start <= endValue) {
                counter += 1;
                start += step;
            }

            System.out.println("Iterations count: " + counter);
            times++;

        }
    }
}
