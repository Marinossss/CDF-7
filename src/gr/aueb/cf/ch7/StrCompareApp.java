package gr.aueb.cf.ch7;

public class StrCompareApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";
        //η μέθοδος compareTo συγκρίνει χαρακτήρα προς χαρακτήρα μέχρι:
        //a)Να βρει την διαφορά σε κάποιον χαρακτήρα με τον αλλο χαρακτηρα συμβολαιοσειρας.
        //b)Ή να τελειώσουν οι χαρακτήρες της μικρότερης συμβολοσειράς.
        if (s1.compareTo(s2) > 0) { // συγκρινουμε το s1 με το s2 και που μας δινουν ενα θετικο αριθμο
            System.out.println("s1 > s2"); //συστημα ASCI
        } else if (s1.compareTo(s2) < 0) { // αν ειναι μικροτερο..
            System.out.println("s1 < s2");
        } else { // if (s1.comparesTo(s2) == 0) //εαν ειναι ιδιες αριθμος ASCI
            System.out.println("s1.equals(s2)== true");

        }
        if (s1.compareToIgnoreCase(s2) > 0) { //compareToIgnoreCase αγνοει τα κεφαλαια
            System.out.println("s1 > s2");
        } else if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("s1 < s2");
        } else { // if (s1.comparesTo(s2) == 0)
            System.out.println("s1.equals(s2)== true");
        }

    }
}