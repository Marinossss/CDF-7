package gr.aueb.cf.ch7;

public class StrConcatApp {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Factory";

        String s3 = s1 + s2;    // + is overloaded
        String s4 = s1.concat(s2);

        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2); // method chaining
//Η μέθοδος concat() στην Java απλά συνενώνει δύο συμβολοσειρές (Strings),
// βάζοντας τη δεύτερη συμβολοσειρά ακριβώς στο τέλος της πρώτης.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}