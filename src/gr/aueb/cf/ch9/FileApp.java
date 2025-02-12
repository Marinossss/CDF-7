package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file7.txt");     // C:\tmp\file7.txt
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) { //Αυτή η εντολή ελέγχει αν υπάρχει άλλη γραμμή στο αρχείο που δεν έχει διαβαστεί ακόμα. Αν υπάρχει, ο βρόχος συνεχίζει.
                line = in.nextLine(); //Η μέθοδος nextLine() διαβάζει την τρέχουσα γραμμή από το αρχείο και την επιστρέφει ως String. Αυτή αποθηκεύεται στη μεταβλητή line.
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//αυτος ο κωδικας διαβαζει το αρχειο γραμμη προς γραμμη μεχρι που δεν εχει να διαβασει αλλο και σταματαει
//να τρεχει