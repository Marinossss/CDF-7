package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Επιλεξτε ενα απο τα παρακατω:");
            System.out.println("1.One-player game");
            System.out.println("2.Two-player game");
            System.out.println("3.three-player game");
            System.out.println("4. Quit\n");

            choice = in.nextInt();

            if(choice < 1 || choice > 4) {
                System.out.println("Choice must be between 1-4");
                System.out.println("Try again");
                continue;
            }
//            if (choice ==1) {
//                System.out.println("One player game started.");
//            } else  if (choice == 2){
//                System.out.println("Two player game started.");
//            } else if (choice == 3) {
//                System.out.println("Three player game started ");
//            } else {
//                System.out.println("Quiting");
//            }

            switch (choice) {
                case 1: //Αν η τιμή της choice είναι 1, τότε εκτυπώνεται το μήνυμα
                    System.out.println("One player game started.");
                    break;
                case 2: //Αν η τιμή της choice είναι 2, τότε εκτυπώνεται το μήνυμα κλπ κλπ
                    System.out.println("Two player game started.");
                    break;
                case 3:
                    System.out.println("Three player game started.");
                    break;
                case 4:
                    System.out.println("Quiting");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;

            }
        } while (choice != 4);
    }
}
