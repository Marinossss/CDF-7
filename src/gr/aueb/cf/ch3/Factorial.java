package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert input num");
        inputNum = in.nextInt();

        //facto = ...
        while (i <= inputNum) { //υπολογιζει το παραγοντικο του n=
            facto *= i; //facto = facto * i;
            i++;
        }
        System.out.println("Factorial: " + facto);
    }
}
