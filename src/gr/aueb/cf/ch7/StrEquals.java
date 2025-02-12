package gr.aueb.cf.ch7;

public class StrEquals {

    public static void main(String[] args) {


        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "ATHENS";

        boolean equal1 = s1.equals(s2); //true , συγκριση
        boolean equal2 = s1.equals(s3); // false , συγκριση
        boolean equal3 = s1.equalsIgnoreCase(s3); //true , συγκριση δεν λαμβανει υποψην τα κεφαλαια

        boolean equal4 = s1.toUpperCase().equals(s3.toLowerCase());
//toUpperCase τα κανει ολα κεφαλαια και τα συγκρινει αν ειναι ολα ιδια επιστρεφει true αλλιως false ..
// ανεξαρτητως αν τα εχουμε αποθηκευσει σε boolean
    //    equals(): Ελέγχει για απόλυτη ισότητα (λαμβάνοντας υπόψη πεζά/κεφαλαία).
    //    equalsIgnoreCase(): Ελέγχει για ισότητα αγνοώντας πεζά/κεφαλαία.
    // επιστρεφουν true η false  ανεξαρτητως αν τα εχουμε αποθηκευσει σε boolean.





    }
}
