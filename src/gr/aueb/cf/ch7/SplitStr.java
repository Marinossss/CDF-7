package gr.aueb.cf.ch7;

public class SplitStr {

    public static void main(String[] args) {

        String a = "Athens        Uni of    Econ    and Business";


        // Χρήση του split για να διαχωρίσουμε τη συμβολοσειρά σε λέξεις
        // Το "\\s+" σημαίνει "ένα ή περισσότερα λευκά διαστήματα" (κενά, tabs, νέες γραμμές,πχ\n κ.λπ.)
        //Αν το χρησιμοποιήσεις στο split(), αγνοεί τα περιττά κενά και διαχωρίζει τη συμβολοσειρά σε λέξεις.
        String[] tokens = a.split("\\s+");


        // Εδώ κάνουμε loop για να περάσουμε από κάθε λέξη στον πίνακα 'tokens'
        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}
