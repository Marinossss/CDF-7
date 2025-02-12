package gr.aueb.cf.ch7;

import javax.swing.*;

public class StrTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "-"); //για καθε στοιχειο που τρεχει προσθετει μια παυλα
        }

        System.out.println();

        for (int i = s.length() -1 ; i >= 0; i--) { //εκτυπωνει αναποδα καθε στοιχειο του s.lenght
            System.out.print(s.charAt(i)+ " "); //s.charAt εκτυπωνει καθε στοιχειο του πινακα
        }

        System.out.println();

        for (char el : s.toCharArray()) { //το toCharArray ειναι για εκτυπωση
            System.out.print(el);
        }
    }


}
